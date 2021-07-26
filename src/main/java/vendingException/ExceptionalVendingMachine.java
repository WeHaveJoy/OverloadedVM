package vendingException;

import vending.products.*;

public class ExceptionalVendingMachine {

    int softDrinkQty;
    int saltySnacksQty;
    int chocolatesQty;


    ExceptionalVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty){

        this.softDrinkQty = softDrinkQty;
        this.saltySnacksQty = saltySnacksQty;
        this.chocolatesQty = chocolatesQty;
    }

    void buy(Product product) throws ProductNotFoundException, InvalidProductException {

        if(!(product instanceof SoftDrink) && !(product instanceof SaltySnack) && !(product instanceof Chocolate)){
            throw new InvalidProductException(product);
        }

        if(product instanceof SoftDrink && (softDrinkQty - 1) <= 0) {
            throw new SoftDrinksOutOfStockException(product);
        }
        else{
            softDrinkQty -= 1;
        }

        if(product instanceof SaltySnack && (saltySnacksQty - 1) <= 0) {
            throw new SaltySnacksOutOfStockException(product);
        }
        else{
            saltySnacksQty -= 1;
        }

        if(product instanceof Chocolate && (chocolatesQty - 1) <= 0) {
            throw new ChocolatesOutOfStockException(product);
        }
        else{
            chocolatesQty -= 1;
        }
    }


    void addStock(Product product, int newStock){

        if(product instanceof  SoftDrink){
            softDrinkQty += newStock;
        }

        if(product instanceof  SaltySnack){
            saltySnacksQty += newStock;
        }

        if(product instanceof  Chocolate){
            chocolatesQty += newStock;
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

        else{
            return 0;
        }
    }

}
