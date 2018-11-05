package Main.TestExercise;

import java.util.Map;
import java.util.TreeMap;

public class Basket {

    protected static final String ITEM_ORDER_FORMAT = "%s (%.2f x %d = %.2f)";

    private final Map<Item,Integer> orderedItems = new TreeMap<>();

    public void add(Item item, int quantity){
        if (quantity <=0){
            throw new IllegalArgumentException(String.format("Niewłaściwa ilość zamówionego towaru = %3d!", quantity))
        }
        if (orderedItems.containsKey(item)){
            quantity = orderedItems.get(item) + quantity;
        }
        orderedItems.put(item, quantity);
    }

    public void add(Item item){
        add(item, 1);
    }

    public void remove(Item item, int quantity){
        if (quantity <=0){
            throw new IllegalArgumentException(String.format("Niewłaściwa ilość zamówionego towaru = %3d!", quantity))
        }
        quantity = orderedItems.get(item) - quantity;

        if (quantity == 0){
            orderedItems.remove(item);
        } else if (quantity < 0){
            throw new IllegalStateException(String.format("Nie ma wystarczającej ilości towaru do usunięcia z koszyka!")):
        } else
            orderedItems.put(item, quantity);


    }

    public void remove (Item item){
        remove(item, 1);
    }


    public static void main(String[] args) {

//        private item()
//
//        orderedItems.put()

    }
}
