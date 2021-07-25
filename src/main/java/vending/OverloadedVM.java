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
//        System.out.println("add 1 SoftDrink");
    }

    void addStock(SaltySnack saltySnack){

        saltySnacksQty += 1;
//        System.out.println("add 1 SaltySnack");
    }

    void addStock(Chocolate chocolate){

        chocolatesQty += 1;
//        System.out.println("add 1 Chocolate");
    }

    void addStock(Product product){

        softDrinkQty += 1;
        saltySnacksQty += 1;
        chocolatesQty += 1;
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
        System.out.println( total );
        return total;

    }


     void buy (Product product, int productNum ){
       if(product instanceof  SoftDrink && (softDrinkQty - productNum)> 0){
           softDrinkQty--;
       }

         if(product instanceof  SaltySnack && (saltySnacksQty - productNum)> 0){
             saltySnacksQty--;
         }

         if(product instanceof  Chocolate && (chocolatesQty - productNum)> 0){
             chocolatesQty--;
         }

    }

    void addStock(Product product, int productNum ){
        if(product instanceof  SoftDrink){
            softDrinkQty += productNum;
        }

        if(product instanceof  SaltySnack){
            saltySnacksQty += productNum;
        }

        if(product instanceof  Chocolate){
            chocolatesQty += productNum;
        }
    }

    }



