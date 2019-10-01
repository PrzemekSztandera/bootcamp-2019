package com.manchesterdigital;

import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {
        // Generic way of creating an ArrayList
        ArrayList names1 = new ArrayList();


        ArrayList<String> names2 = new ArrayList<>();
        names2.add("John");
        names2.add("Sue");
        names2.add(2, "Steve");

        System.out.println("Number of elements: " + names2.size());
        String firstElement = names2.get(0);
        System.out.println("First element: " + firstElement);

        String removedElement = names2.remove(0);
        System.out.println("Removed: " + removedElement);
        System.out.println(names2);
        var steve = names2.remove("Steve");
        System.out.println("Removed by object: " + steve);
        System.out.println(names2);

        ArrayList<String> zooAnimals = new ArrayList<>();
        zooAnimals.add("Lion");
        zooAnimals.add("Hippo");
        zooAnimals.add("Leopard");

        // are there any leopard in the zoo?
        var leopard = zooAnimals.contains("Leopard");
        System.out.println("Is zooAnimals contains Leopard? " + leopard);

        Collections.sort(zooAnimals);
        System.out.println("After sort: " + zooAnimals);

        Collections.shuffle(zooAnimals);
        System.out.println("After shuffle: " + zooAnimals);

        // overrides a element at index X
        zooAnimals.set(1, "Cheetah");
        System.out.println(zooAnimals.get(1));

        // empties the array list
        zooAnimals.clear();
        System.out.println(zooAnimals.size());


        List<Integer> lotteryNumbers = Arrays.asList(1, 23, 45, 6, 88);

    }
}
