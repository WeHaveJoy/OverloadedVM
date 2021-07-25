package vending;

import org.junit.Test;
import vending.products.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OverloadedTest {


    @Test
    public void shouldBeAbleToGet3Products() {

      OverloadedVM o = new OverloadedVM(1,1,1);
        SoftDrink softdrink = new SoftDrink();
        SaltySnack saltysnack = new SaltySnack();
        Chocolate chocolate = new Chocolate();
        o.getStock(softdrink);
        o.getStock(saltysnack);
        o.getStock(chocolate);
        assertEquals(3, o.getStock());
    }


    @Test
    public void shouldBeAbleToAdd3ProductsOnly() {

        OverloadedVM o = new OverloadedVM(2,1,2);
        SoftDrink softdrink = new SoftDrink();
        SaltySnack saltysnack = new SaltySnack();
        Chocolate chocolate = new Chocolate();
        Product product = new Product();
        o.addStock(softdrink);
        o.addStock(saltysnack);
        o.addStock(chocolate);
        o.addStock(product);
        assertEquals(5, o.getStock());
    }


    @Test
    public void shouldBeAbleToBuy3Products() {

        OverloadedVM o = new OverloadedVM(1,1,1);
        SoftDrink softdrink = new SoftDrink();
        SaltySnack saltysnack = new SaltySnack();
        Chocolate chocolate = new Chocolate();
        o.buy(softdrink);
        o.buy(saltysnack);
        o.buy(chocolate);
        assertEquals(3, o.getStock());
    }

    @Test
    public void shouldBeAbleToBuy2SoftDrinks() {
        OverloadedVM o = new OverloadedVM(2,0,0);
        SoftDrink softdrink = new SoftDrink();
        o.buy(softdrink, 2);

        assertEquals(2, o.getStock());
    }

    @Test
    public void shouldBeAbleToBuy6Chocolates() {
        OverloadedVM o = new OverloadedVM(0,0,6);
        Chocolate chocolate = new Chocolate();
        o.buy(chocolate, 6);

        assertEquals(6, o.getStock());
    }

    @Test
    public void shouldBeAbleToBuy3SaltySnacks() {
        OverloadedVM o = new OverloadedVM(0,3,0);
        SaltySnack saltysnack = new SaltySnack();
        o.buy(saltysnack, 3);

        assertEquals(3, o.getStock());
    }

    @Test
    public void shouldBeAbleToAdd5SaltySnacks() {
        OverloadedVM o = new OverloadedVM(0,0,0);
        SaltySnack saltysnack = new SaltySnack();
        o.addStock(saltysnack, 5);

        assertEquals(5, o.getStock());
    }

    @Test
    public void shouldBeAbleToAdd2SoftDrinks() {
        OverloadedVM o = new OverloadedVM(0,0,0);
       SoftDrink softdrink = new SoftDrink();
        o.addStock(softdrink, 2);

        assertEquals(2, o.getStock());
    }
}
