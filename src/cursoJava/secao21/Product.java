package cursoJava.secao21;

import org.jetbrains.annotations.NotNull;

public class Product {

    private String name;
    private Double price;

    public Product(String name, Double price){
        this.price = price;
        this.name = name;
    }

    public Double getDouble(){
        return price;
    }

    public void setDouble(Double price){
        this.price = price;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return "Product [name = " + getName() + ", price = R$" + getDouble() + "]";
    }
}
