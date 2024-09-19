package cursoJava.secao21.Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.0));
        list.add(new Product("HD Case", 80.0));

        /**
         * Criar uma variavel para testar automaticamente o test() -> unico metodo abstrato na classe Predicate;
         **/

        //list.removeIf(new ProductPredicate());

        // method reference
        // Product -> nome da classe do metodo
        // staticProductPredicate -> nome do metodo
        // list.removeIf(Product::staticProductPredicate);

        //Metodo não estatico sendo referenciado vai trabalhar com o Product da propia classe
        // list.removeIf(Product::noStaticProductPredicate);

        //Essa versão é feita com expressão lambda
        // double min = 100.0;
        // Predicate<Product> predicate = p -> p.getPrice() >= min;

        //Ultimo metodo
        list.removeIf(p -> p.getPrice() >= 100.0);
        list.forEach(System.out::println);
    }

}
