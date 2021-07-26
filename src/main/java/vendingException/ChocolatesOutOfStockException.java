package vendingException;

import vending.products.Product;

public class ChocolatesOutOfStockException extends ProductNotFoundException {
    public ChocolatesOutOfStockException(Product product) {
        super("ChocolatesOutOfStockException");
    }
}
