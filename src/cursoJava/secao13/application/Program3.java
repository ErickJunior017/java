package cursoJava.secao13.application;

import cursoJava.secao13.entites.Cliente;
import cursoJava.secao13.entites.Order2;
import cursoJava.secao13.entites.OrderItem;
import cursoJava.secao13.entites.Product;
import cursoJava.secao13.entites.enums.OrderStatus2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter cliente data:");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.printf("Email: ");
        String email = input.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String dateString = input.nextLine();

        Date date = sdf.parse(dateString);
        Cliente client = new Cliente(name, email, date);
        System.out.println();

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String status = input.nextLine();
        System.out.print("How many items to this order? ");
        int quantity = input.nextInt();
        Date dateAgora = new Date();
        Order2 order = new Order2(dateAgora, OrderStatus2.valueOf(status), client);


        for (int i = 0; i < quantity; i++){
            System.out.printf("Enter #%d item data:", i + 1);
            input.nextLine();
            System.out.printf("%nProduct name: ");
            String nameProduct = input.nextLine();
            System.out.printf("Product price: ");
            double price = input.nextDouble();
            System.out.printf("Quantity: ");
            int quantityProduct = input.nextInt();
            System.out.println();
            Product product = new Product(nameProduct, price);
            OrderItem orderItem = new OrderItem(quantityProduct, product.getPrice(), product);
            order.addItem(orderItem);
        }

        System.out.println(order);
    }
}
