package com.manchesterdigital;

import java.util.ArrayList;

public class ForEachExample {

    public static void main(String[] args) {
        /**
         * for(datatype instance : collection) {
         *     // some logic
         * }
         */

        ArrayList<String> students = new ArrayList<>();
        students.add("Callum");
        students.add("Andrew");
        students.add("Trump");

        for (String student : students) {
            System.out.println("student = " + student);
        }

        System.out.println(only1or4(new int[]{1, 4, 1, 4, 4, 1}));
        System.out.println(only1or4(new int[]{1, 1}));
        System.out.println(only1or4(new int[]{4, 4}));
        System.out.println(only1or4(new int[]{1, 4, 1, 5, 4, 1}));
        System.out.println(only1or4(new int[]{5}));

    }

    public static boolean only1or4(int[] array) {

        boolean result = true;
        for (int i : array) {
            if(i != 1 && i !=4) {
                result = false;
                break;
            }
        }
        return result;
    }
}
