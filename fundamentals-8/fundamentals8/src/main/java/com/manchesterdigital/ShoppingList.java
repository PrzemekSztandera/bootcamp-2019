package com.manchesterdigital;

import java.util.ArrayList;

public class ShoppingList {

    private ArrayList<String> list;

    public ShoppingList() {
        list = new ArrayList<>();
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void addItemToShoppingList(String item) {
        list.add(item);
    }

    public void removeItemFromShoppingList(String item) {
        list.remove(item);
    }


    public void updateShoppingList(String item, String newItem) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(item)) {
                list.set(i, newItem);
            } else {
                // throw Exception
            }
        }
    }
}
