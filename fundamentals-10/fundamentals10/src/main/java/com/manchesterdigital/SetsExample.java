package com.manchesterdigital;

import java.util.*;

public class SetsExample {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("John");
        names.add("April");
        names.add("Jack");
        names.add("Emalin");
        names.add("Paul");
        names.add("Jack");
        names.add("Jack");
        names.add("Jack");
        names.add("Tom");

        System.out.println("Size = " + names.size());
        for(String name : names) {
            System.out.println("name = " + name);
        }

        System.out.println("-----------------------");

        Set<String> namesOrdered = new TreeSet<>();
        namesOrdered.add("John");
        namesOrdered.add("April");
        namesOrdered.add("Jack");
        namesOrdered.add("Emalin");
        namesOrdered.add("Paul");
        namesOrdered.add("Jack");
        namesOrdered.add("Jack");
        namesOrdered.add("Jack");

        System.out.println("Size = " + namesOrdered.size());
        for(String name : namesOrdered) {
            System.out.println("name = " + name);
        }

        List<String> footballers =
                Arrays.asList("Ronaldo", "Messi", "Neymar", "Rooney", "Zlatan", "Ronaldo");
        Set<String> uniqueFootballers = new TreeSet<>(footballers);
        System.out.println("uniqueFootballers = " + uniqueFootballers);
        System.out.println("------------------------------------");

        // union(whats in both)
        Set<String> cats = new HashSet<>();
        cats.add("Lion");
        cats.add("Cheetah");

        Set<String> reptiles = new HashSet<>();
        reptiles.add("Snake");
        reptiles.add("Crocodile");

        Set<String> zoo = new HashSet<>();
        zoo.addAll(reptiles);
        System.out.println("zoo = " + zoo);
        System.out.println("---------------------------------------");

        // intersection
        Set<String> otherNames = new HashSet<>();
        otherNames.add("John");
        otherNames.add("Joanne");
        otherNames.add("Jill");
        otherNames.add("Susan");
        otherNames.add("April");
        otherNames.add("Jack");
        Set<String> intersectionOfBoth = new HashSet<>(names);

        intersectionOfBoth.retainAll(otherNames);
        System.out.println("intersectionOfBoth = " + intersectionOfBoth);
        System.out.println("---------------------------------------");

        // differences
        Set<String> nameDifferences = new HashSet<>(names);
        nameDifferences.removeAll(otherNames);
        System.out.println("nameDifferences = " + nameDifferences);

    }
}
