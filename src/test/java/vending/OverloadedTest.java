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

        OverloadedVM o = new OverloadedVM(1,1,1);
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

//    @Test
//    public void shouldBeAbleToSpecifyProductsBought() {
//        OverloadedVM o = new OverloadedVM(1,1,1);
//        o.buy(2,1,3);
//
//        assertEquals(, o.getStock());
//    }

}
