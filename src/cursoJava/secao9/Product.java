package cursoJava.secao9;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(){

    }
    /**
     * <h1>Metodos get e set</h1>
    * <p>Quando você quiser intância um objeto porem não quer implementar todos os valores faça</p>
    * a sobrecaraga que implementa varios contruturos de classe com parametros diferentes.
    * */
    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price){
        this.name = name;
        this.price = price;
        quantity = 0;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQuantity(){
        return quantity;
    }

    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int addQuantity){
         quantity += addQuantity;
    }

    public  void removeProducts(int removeQuantity){
         quantity -= removeQuantity;
    }

    public String toString(){
        return name
                + ", $"
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, total: $"
                + String.format("%.2f", totalValueInStock());
    }
}
