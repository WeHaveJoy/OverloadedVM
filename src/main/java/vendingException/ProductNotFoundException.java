package vendingException;

public class ProductNotFoundException extends Exception {

    public ProductNotFoundException(String items){
        super(items);
    }

}