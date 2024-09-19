package cursoJava.secao21.Predicate;

public class Product {

    private String name;
    private Double price;

    public Product(String name, Double price){
        this.price = price;
        this.name = name;
    }

    public Product(){
    }

    public Double getPrice(){
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

    public static boolean staticProductPredicate(Product p){
        return p.getPrice() >= 100.0;
    }

    public boolean noStaticProductPredicate(){
        return price >= 100.0;
    }

    @Override
    public String toString(){
        return "Product [name = " + getName() + ", price = R$" + getPrice() + "]";
    }
}
