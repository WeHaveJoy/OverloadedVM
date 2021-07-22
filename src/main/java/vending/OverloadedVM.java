package vending;

import vending.products.*;

public class OverloadedVM {

    int softDrinkQty;
    int saltySnacksQty;
    int chocolatesQty;

    OverloadedVM(int softDrinkQty, int saltySnacksQty, int chocolatesQty){

        this.softDrinkQty = softDrinkQty;
        this.saltySnacksQty = saltySnacksQty;
        this.chocolatesQty = chocolatesQty;
    }


    void buy(SoftDrink softdrink){

        System.out.println("buy 1 SoftDrink");
    }

    void buy(SaltySnack saltySnack){

        System.out.println("buy 1 SaltySnack");
    }

    void buy(Chocolate chocolate){
        System.out.println("buy 1 Chocolate");
    }

    void buy(Product product){

        System.out.println("buy 1 of each product");
    }


    void addStock(SoftDrink softdrink){
        System.out.println("add 1 SoftDrink");
    }

    void addStock(SaltySnack saltySnack){
        System.out.println("add 1 SaltySnack");
    }

    void addStock(Chocolate chocolate){
        System.out.println("add 1 Chocolate");
    }

    void addStock(Product product){
        System.out.println("add 3 stock items for each Product type.");
    }

    int getStock(SoftDrink softdrink){
        return softDrinkQty;
    }

    int getStock(SaltySnack saltySnack){
        return saltySnacksQty;
    }

    int getStock(Chocolate chocolate){
        return chocolatesQty;
    }

    int getStock(){
        int total = saltySnacksQty + softDrinkQty + chocolatesQty;
        return total;
    }

    }



