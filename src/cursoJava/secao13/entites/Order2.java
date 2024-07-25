package cursoJava.secao13.entites;

import cursoJava.secao13.entites.enums.OrderStatus2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order2 {
    private Date moment;
    private OrderStatus2 status;
    private Cliente client;

    private List<OrderItem> item = new ArrayList<>();

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public Order2() {
    }

    public Order2(Date moment, OrderStatus2 status, Cliente client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus2 getStatus() {
        return status;
    }

    public void setStatus(OrderStatus2 status) {
        this.status = status;
    }


    public List<OrderItem> getItem() {
        return item;
    }

    public Cliente getClient() {
        return client;
    }

    public void setClient(Cliente client) {
        this.client = client;
    }

    public void addItem(OrderItem item){
        getItem().add(item);
    }

    public void removeItem(OrderItem item){
        getItem().remove(item);
    }

    public Double total(){
        Double total = 0.0;
        for (OrderItem i : item){
            total += i.subTotal();
        }
        return total;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY: \n");
        sb.append("Order moment: " + sdf.format(getMoment()) + "\n");
        sb.append("Order status: " + getStatus() + "\n");
        sb.append("Client: " + getClient().getName());
        sb.append(" (" + getClient().getBirthDate() + ") - ");
        sb.append(getClient().getEmail() + "\n");
        sb.append("Order items: \n");
        for (OrderItem i : item){
            sb.append(i.getProduct().getName() + ", ");
            sb.append("$" + String.format("%.2f", i.getPrice()) + ", ");
            sb.append("Quantity: " + i.getQuantity() + ", ");
            sb.append("Subtotal: $" + String.format("%.2f", i.subTotal()) + "\n");
        }
        sb.append("Total price: $" + String.format("%.2f", total()));
        return sb.toString();
    }
}
