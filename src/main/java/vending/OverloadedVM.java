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

        softDrinkQty -= 1;
//        System.out.println("buy 1 SoftDrink");
    }

    void buy(SaltySnack saltySnack){

        saltySnacksQty -= 1;
//        System.out.println("buy 1 SaltySnack");
    }

    void buy(Chocolate chocolate){

        chocolatesQty -= 1;
//        System.out.println("buy 1 Chocolate");
    }

    void buy(Product product){
        softDrinkQty -= 1;
        saltySnacksQty -= 1;
        chocolatesQty -= 1;
//        System.out.println("buy 1 of each product");
    }


    void addStock(SoftDrink softdrink){
        softDrinkQty += 1;
    }

    void addStock(SaltySnack saltysnack){
        softDrinkQty += 1;
    }

    void addStock(Chocolate chocolate){
        softDrinkQty += 1;
    }

    void addStock(Product product){
        softDrinkQty += 1;
        saltySnacksQty += 1;
        chocolatesQty += 1;
//        System.out.println("add 3 stock items for each Product type.");
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
        System.out.println( total );
        return total;

    }


     void buy (Product product, int qty ){
       if(product instanceof  SoftDrink && (softDrinkQty - qty)> 0){
           softDrinkQty -= qty;
       }

         if(product instanceof  SaltySnack && (saltySnacksQty - qty)> 0){
             saltySnacksQty -= qty;
         }

         if(product instanceof  Chocolate && (chocolatesQty - qty)> 0){
             chocolatesQty -= qty;
         }

    }


    void addStock(Product product, int qty ){
        if(product instanceof  SoftDrink){
            softDrinkQty += qty;
        }

        if(product instanceof  SaltySnack){
            saltySnacksQty += qty;
        }

        if(product instanceof  Chocolate){
            chocolatesQty += qty;
        }
    }

    }




