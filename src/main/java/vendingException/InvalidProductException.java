package vendingException;

import vending.products.Product;

public class InvalidProductException extends RuntimeException{
    public InvalidProductException(Product product){
        System.out.println("InvalidProductException");
    }
}
