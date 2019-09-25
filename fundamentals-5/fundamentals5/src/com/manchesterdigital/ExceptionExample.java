package com.manchesterdigital;

public class ExceptionExample {

    public static void main(String[] args) {

        int[] intArr = {1, 2, 3};

        printArray(0, intArr);
        printArray(1, intArr);
        printArray(2, intArr);
        try {

            printArray(3, intArr);
        } catch (ArrayIndexOutOfBoundsException e) {
            //e.printStackTrace();
            System.err.println("Element does not exist " + e);

        }
        System.out.println("Lol");


    }

    private static void printArray(int idx, int[] arr) {
        System.out.println("Elements " + idx + " is " + arr[idx]);
    }
}
