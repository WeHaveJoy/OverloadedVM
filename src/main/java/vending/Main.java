package vending;

import vending.products.Chocolate;
import vending.products.Product;
import vending.products.SaltySnack;
import vending.products.SoftDrink;

public class Main {
    public static void main(String[] args) {
        OverloadedVM o = new OverloadedVM(1,1,1);
        SaltySnack s = new SaltySnack();
        SoftDrink d = new SoftDrink();
        Chocolate c = new Chocolate();
        Product p = new Product();

        o.buy(2,1,3);
        o.addStock(4,1,1);

//        o.buy(s);
//        o.addStock(s);
//        o.getStock(s);
//        o.buy(d);
//        o.addStock(d);
//        o.getStock(d);
//        o.buy(c);
//        o.addStock(c);
//        o.getStock(c);
//        o.buy(p);
//        o.addStock(p);
//        o.getStock();
    }
}
