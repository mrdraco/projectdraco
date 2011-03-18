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
}