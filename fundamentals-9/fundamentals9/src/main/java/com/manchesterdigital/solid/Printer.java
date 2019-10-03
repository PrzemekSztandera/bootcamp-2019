package com.manchesterdigital.solid;

public interface Printer {
    default void printToConsole(String text) {
        System.out.println(text);
    }
}
