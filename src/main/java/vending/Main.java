package vending;


import vending.products.SoftDrink;

public class Main {
    public static void main(String[] args) {
        OverloadedVM purchase = new OverloadedVM(2,2,2);

        purchase.buy(new SoftDrink(), 2);
    }
}
