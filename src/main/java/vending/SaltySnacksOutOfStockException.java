package vending;

import vending.products.Product;

public class SaltySnacksOutOfStockException extends ProductNotFoundException {
    public SaltySnacksOutOfStockException(Product product) {
        super("SaltySnacksOutOfStockException");
    }
}
