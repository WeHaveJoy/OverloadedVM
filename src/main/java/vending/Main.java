package vending;

import vending.products.SaltySnack;

public class Main {
    public static void main(String[] args) {
        OverloadedVM o = new OverloadedVM(1,1,1);
        SaltySnack s = new SaltySnack();
        o.buy(s);
        o.getStock(s);

    }
}
