package vendingException;

import vending.products.Product;
import vendingException.ProductNotFoundException;

public class SoftDrinksOutOfStockException extends ProductNotFoundException {
    public SoftDrinksOutOfStockException(Product product) {
        super("SoftDrinksOutOfStockException");
    }
}
