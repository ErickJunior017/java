package cursoJava.secao21.Consumer;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {

    @Override
    public void accept(Product product) {
        product.setPrice(product.getPrice() + product.getPrice() * 0.10);
    }
}
