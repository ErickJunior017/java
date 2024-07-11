package cursoJava.secao9;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public Product(){

    }
    /*
    * Quando você quiser intância um objeto porem não quer implementar todos os valores faça a
    * sobrecaraga que implementa varios contruturos de classe com parametros diferentes.
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
