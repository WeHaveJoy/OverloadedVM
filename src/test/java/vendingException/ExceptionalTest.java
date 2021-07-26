package vendingException;

import org.junit.Test;
import vending.products.Biltong;
import vending.products.Chocolate;
import vending.products.SaltySnack;
import vending.products.SoftDrink;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExceptionalTest {


    @Test
    public void shouldBeAbleToCallSaltySnacksOutOfStockException() {
       ExceptionalVendingMachine exceptional = new ExceptionalVendingMachine(0,1,0);
        SaltySnack saltysnack = new SaltySnack();

        try {
            exceptional.buy(saltysnack);
        } catch (ProductNotFoundException e) {
            e.printStackTrace();
        }
        assertEquals(1, exceptional.getStock(saltysnack));
    }

    @Test
    public void shouldBeAbleToCallSoftDrinkOutOfStockException() {
        ExceptionalVendingMachine exceptional = new ExceptionalVendingMachine(0,0,0);
      SoftDrink softdrink = new SoftDrink();

        try {
            exceptional.buy(softdrink);
        } catch (ProductNotFoundException e) {
            e.printStackTrace();
        }
        assertEquals(0, exceptional.getStock(softdrink));
    }

    @Test
    public void shouldBeAbleToCallChocolateOutOfStockException() {
        ExceptionalVendingMachine exceptional = new ExceptionalVendingMachine(0,0,0);
        Chocolate chocolate = new Chocolate();

        try {
            exceptional.buy(chocolate);
        } catch (ProductNotFoundException e) {
            e.printStackTrace();
        }
        assertEquals(0, exceptional.getStock(chocolate));
    }

    @Test
    public void shouldBeAbleToCallProductNotFoundException() {
        ExceptionalVendingMachine exceptional = new ExceptionalVendingMachine(0,0,0);
        Biltong biltong = new Biltong();

        try {
            exceptional.buy(biltong);
        } catch (ProductNotFoundException e) {
            e.printStackTrace();
        }

        assertEquals(0, exceptional.getStock(biltong));
    }
}
