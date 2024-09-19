package cursoJava.secao21.Predicate;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product product){
        if (product.getPrice() >= 100.0){
            return true;
        } else {
            return false;
        }
    }
}
