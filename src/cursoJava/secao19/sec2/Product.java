package cursoJava.secao19.sec2;

import org.jetbrains.annotations.NotNull;

public class Product implements Comparable<Product>{

    private String name;
    private Double price;

    public Product(Double price, String name) {
        this.price = price;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    @Override
    public String toString(){
        return getName() + ", " + String.format("R$%.2f", getPrice());
    }

    @Override
    public int compareTo(@NotNull Product other) {
        return price.compareTo(other.getPrice());
    }
}
