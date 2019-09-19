package com.manchesterdigital;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Currency;
import java.util.Date;
import java.util.List;

/**
 * Describes usage of variables and data types.
 *
 * @author Przemek.
 */
public class VariablesExample {
    static boolean itsRaining;

    public static void main(String[] args) {
        int numberOfAnimals;
        numberOfAnimals = 10;
        System.out.println("Number of animals is " + numberOfAnimals);

        int i1,  i2, i3; //Bad practice

        /*
        This declares 3 variables of type int, however only d3 is set to 3.
        The others are set to undefined.
         */
        int d1, d2, d3 = 3;

        long diameterOfSunInMiles = 2_140_000_000;
        float f = 0.9F;
        boolean isRaining = false;
        System.out.println(isRaining);

        float pi = 3.14f;
        double percentage = 49.5d;
        char initial = 'F';
        // Non primitive data types

        String firstName = "John";
        String lastName = "Doe";
        /*
        This creates four strings
        One is firstName
        One is anonymous
        One is lastName
        one is the whole string 'John Doe'
         */
        //System.out.println("Name: " + firstName + " " + lastName);
        //System.out.printf("Name: %s %s", firstName, lastName);
        System.out.println();

        //System.out.println(String.format("Name: %s %s", firstName, lastName));

        StringBuilder output = new StringBuilder();
        /*
        output.append(firstName);
        output.append(" ");
        output.append(lastName);
        */
        output.append(firstName).append(" ").append(lastName);
        System.out.println(output);

        int[] numbers = new int[10];
        numbers[0] = 99;

        int[] lotteryNumbers = { 23, 45, 66 };

        System.out.println(numbers[0]);
        System.out.println(lotteryNumbers[2]);
        System.out.println(Arrays.toString(numbers));

        String[] names = { "john", "doe", "mike" };


        List<Integer> arrayList = Arrays.asList(45,54);
        arrayList.set(1, 43);

        Date today = new Date();
        System.out.println(today);

        Integer numberOfStudents = 10;
        System.out.println(numberOfStudents.longValue());
        Boolean myBoolean = Boolean.FALSE;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);


        hello();
    }

    /**
     * This is my hello method
     *
     * @deprecated because its crap. Use {@link CodingStandards}
     */
    @Deprecated
    private static void hello() {
        System.out.println("Hello");
    }
}
