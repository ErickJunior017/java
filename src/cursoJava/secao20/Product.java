package cursoJava.secao20;

import java.util.Objects;

public class Product {
    private Double price;
    private String name;

    public Product(String name, Double price) {
        this.price = price;
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(price, product.price) && Objects.equals(name.toUpperCase(), product.name.toUpperCase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, name.toUpperCase());
    }
}
