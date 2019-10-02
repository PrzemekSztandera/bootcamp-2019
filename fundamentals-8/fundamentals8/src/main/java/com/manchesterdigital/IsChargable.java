package com.manchesterdigital;

public interface IsChargable {
    void supercharge();

    default void describe() {

        System.out.println("I am green!");
    }

}