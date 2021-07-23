package vending;

import vending.products.*;

public class OverloadedVM {

    int softDrinkQty;
    int saltySnacksQty;
    int chocolatesQty;
    int itemMax =3;
    int items= 3;

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
        System.out.println("There are: " + total + " items");
        return total;

    }


//     void buy (int saltySnacks, int softDrinks, int chocolates ){
//        System.out.println("You bought "+ saltySnacks + " saltySnack(s)");
//         System.out.println("You bought "+ softDrinks + " softDrink(s)");
//         System.out.println("You bought "+ chocolates + " chocolate(s)");
//
//    }
//
//    void addStock(int saltySnacks, int softDrinks, int chocolates ){
//
//        System.out.println("You added "+ saltySnacks + " saltySnack(s)");
//        System.out.println("You added "+ softDrinks + " softDrink(s)");
//        System.out.println("You added "+ chocolates + " chocolate(s)");
//
//    }

    }



