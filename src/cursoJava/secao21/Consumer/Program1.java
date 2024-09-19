package cursoJava.secao21.Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Program1 {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // Consumer<Product> c = p -> p.setPrice(p.getPrice() * 1.10);

        list.forEach(p -> p.setPrice(p.getPrice() * 1.10));

        list.forEach(System.out::println);
    }
}
