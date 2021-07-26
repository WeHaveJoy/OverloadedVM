package vendingExtendable;

import org.junit.Test;
import vending.products.Biltong;
import vending.products.Chocolate;
import vending.products.SaltySnack;
import vending.products.SoftDrink;
import vendingExtendable.ExtendableVendingMachine;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExtendableTest {

    @Test
    public void shouldBeAbleToAdd3SoftDrinks() {
        ExtendableVendingMachine extend = new ExtendableVendingMachine(0,0,0,0);
        SoftDrink softdrink = new SoftDrink();
        extend.add(softdrink);
        assertEquals(3, extend.getStock(softdrink));
    }

    @Test
    public void shouldBeAbleToAdd6Chocolates() {
        ExtendableVendingMachine extend = new ExtendableVendingMachine(0,0,0,0);
        Chocolate chocolate = new Chocolate();
        extend.add(chocolate);
        extend.add(chocolate);
        assertEquals(6, extend.getStock(chocolate));
    }

    @Test
    public void shouldBeAbleToBuy1Biltongs() {
        ExtendableVendingMachine extend = new ExtendableVendingMachine(0,0,0,3);
        Biltong biltong = new Biltong();
        extend.buy(biltong);
        assertEquals(2, extend.getStock(biltong));
    }

    @Test
    public void shouldBeAbleToBuy4SaltySnacks() {
        ExtendableVendingMachine extend = new ExtendableVendingMachine(0,6,0,0);
        SaltySnack saltysnack = new SaltySnack();
        extend.buy(saltysnack);
        extend.buy(saltysnack);
        extend.buy(saltysnack);
        extend.buy(saltysnack);
        assertEquals(2, extend.getStock(saltysnack));
    }

}
