package vendingException;

import vending.products.Product;
import vendingException.ProductNotFoundException;

public class SaltySnacksOutOfStockException extends ProductNotFoundException {
    public SaltySnacksOutOfStockException(Product product) {
        super("SaltySnacksOutOfStockException");
    }
}
