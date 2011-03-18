package chris.shopping;

import java.util.ArrayList;

public class ShoppingAction {

    public static void main(String[] args) {
        CheckoutBasket basket = new CheckoutBasket(10);

        Item processorI5 = new Item("abdird7899", 187);
        Item cable = new Item("cb7666", 33);
        Item disk = new Item("dk4446", 55);

        basket.addItem(processorI5);
        basket.addItem(cable);
        basket.addItem(disk);


        ArrayList<Item> items = basket.items;

        for(int i=0; i<items.size();i++) {
            System.out.println(items.get(i).productCode);

        }


    }
}
