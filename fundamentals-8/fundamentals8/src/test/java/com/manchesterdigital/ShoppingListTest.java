package com.manchesterdigital;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class ShoppingListTest {

    @Test
    public void whenObjectIsAddedTheSizeOfTheListShouldIncreaseByOne() {
        // arrange
        ShoppingList shoppingList = new ShoppingList();
        String item = "bread";
        // act
        shoppingList.addItemToShoppingList(item);

        // assert
        assertThat(shoppingList.getList().size()).isEqualTo(1);
    }

    @Test
    public void whenObjectIsRemovedTheSizeOfTheListShouldDecreaseByOne() {
        // arrange
        ShoppingList shoppingList = new ShoppingList();
        String item = "bread";
        shoppingList.addItemToShoppingList(item);
        // act

        shoppingList.removeItemFromShoppingList(item);

        // assert
        assertThat(shoppingList.getList().size()).isEqualTo(0);
    }

    @Test
    public void updateShoppingListShouldUpdateTheList() {
        // arrange
        ShoppingList shoppingList = new ShoppingList();
        String item = "bread";
        shoppingList.addItemToShoppingList(item);
        String newItem = "milk";
        // act
        shoppingList.updateShoppingList(item, newItem);

        // assert
        assertThat(shoppingList.getList().get(0)).isEqualTo("milk");
    }
}
