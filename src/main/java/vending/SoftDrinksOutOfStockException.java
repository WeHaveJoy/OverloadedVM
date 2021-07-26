package vending;

import vending.products.Product;

public class SoftDrinksOutOfStockException extends ProductNotFoundException {
    public SoftDrinksOutOfStockException(Product product) {
        super("SoftDrinksOutOfStockException");
    }
}
