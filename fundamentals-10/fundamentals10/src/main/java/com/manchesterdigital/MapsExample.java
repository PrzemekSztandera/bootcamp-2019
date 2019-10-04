package com.manchesterdigital;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsExample {
    public static void main(String[] args) {
        Map<Integer, String> names = new HashMap<>();
        names.put(2, "John");
        names.put(3, "Jill");
        names.put(4, "Susan");
        names.put(1, "Andrew");

        for(Map.Entry<Integer, String> entry : names.entrySet()) {
            System.out.println("entry = " + entry);
        }

        System.out.println("-----------------------------------");

        Map<Integer, String> countries = new TreeMap<>();
        countries.put(23, "England");
        countries.put(2, "Spain");
        countries.put(99, "France");
        countries.put(77, "Germany");

        for (Map.Entry<Integer, String> entry : countries.entrySet()) {
            System.out.println("entry = " + entry);
        }

    }
}
