package chris.shopping;

import java.util.ArrayList;

public class CheckoutBasket {

    public ArrayList<Item> items = new ArrayList<Item>();
//    public Item[] items = new Item[10];

    public CheckoutBasket(int a) {
    }

    public void addItem(Item a) {
        items.add(a);
    }


    public int getTotalPrice() {
        int totalPrice = 0;

        for(int i=0;i<items.size();i++) {
            int currentItemPrice = items.get(i).price;
            totalPrice = totalPrice + currentItemPrice;
        }

        return  totalPrice;

    }
}