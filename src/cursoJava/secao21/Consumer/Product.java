package cursoJava.secao21.Consumer;

public class Product {

    private String name;
    private Double price;

    public Product(String name, Double price){
        this.price = price;
        this.name = name;
    }

    public Double getPrice(){
        return price;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public static void StaticUpdate(Product product) {
        product.setPrice(product.getPrice() + product.getPrice() * 0.10);
    }

    public void notStaticUpdate() {
        setPrice(getPrice() + getPrice() * 0.10);
    }

    public String toString(){
        return "Product [name = " + getName() + ", price = R$" + String.format("%.2f", getPrice()) + "]";
    }
}
