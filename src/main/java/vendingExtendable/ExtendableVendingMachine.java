package vendingExtendable;

import vending.products.*;

public class ExtendableVendingMachine {
    public  int softDrinkQty;
    public   int saltySnacksQty;
    public   int chocolatesQty;
    public  int biltongQty;

    ExtendableVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty, int biltongQty){

        this.softDrinkQty = softDrinkQty;
        this.saltySnacksQty = saltySnacksQty;
        this.chocolatesQty = chocolatesQty;
        this.biltongQty = biltongQty;
    }

    void buy(Product product){
        if(product instanceof SoftDrink && (softDrinkQty - 1)> 0){
            softDrinkQty -= 1;
        }

        if(product instanceof SaltySnack && (saltySnacksQty - 1)> 0){
            saltySnacksQty -= 1;
        }

        if(product instanceof Chocolate && (chocolatesQty - 1)> 0){
            chocolatesQty -= 1;
        }

        if(product instanceof Biltong && (biltongQty - 1)> 0){
            biltongQty -= 1;
        }
    }

    void add(Product product){

        if(product instanceof  SoftDrink){
            softDrinkQty += 3;
        }

        if(product instanceof  SaltySnack){
            saltySnacksQty += 3;
        }

        if(product instanceof  Chocolate){
            chocolatesQty += 3;
        }

        if(product instanceof  Biltong){
            biltongQty += 3;
        }
    }

    int getStock(Product product){
        if(product instanceof SoftDrink){
            return softDrinkQty;
        }

        if(product instanceof SaltySnack){
            return saltySnacksQty;
        }

        if(product instanceof Chocolate){
            return chocolatesQty;
        }

        if(product instanceof Biltong){
            return biltongQty;
        }
        else{
            return 0;
        }
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

        if(product instanceof  Biltong && (biltongQty - qty)> 0){
            biltongQty -= qty;
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

        if(product instanceof  Biltong){
            biltongQty += qty;
        }
    }


}
