package com.manchesterdigital.mockpractice;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class CustomerTest {
    Customer c1;
    Item item1;
    Item item2;

    @Before
    public void setUp() throws Exception {
        c1 = new Customer();
        c1.setName("John");
        List<Item> listOfItems = new ArrayList<>();
        item1 = mock(Item.class);
        item2 = mock(Item.class);
        listOfItems.add(item1);
        listOfItems.add(item2);
        c1.setListOfItems(listOfItems);
    }



    @Test
    public void calculateBillTest() {
        // given
        given(item1.getName()).willReturn("Hello");
        given(item2.getName()).willReturn("World");
        given(item1.getPrice("Hello")).willReturn(200);
        given(item2.getPrice("World")).willReturn(500);
        // when
        int amount = c1.calculateBill();

        assertEquals(700, amount);
    }
}
