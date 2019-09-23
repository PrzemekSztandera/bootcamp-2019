package com.manchesterdigital;

public class Variables {
    static boolean isHungry = false;
    static int counter = 0;

    public static void main(String[] args) {
        greetWhenAdult(12);

    }

    /**
     * Greets based on age.
     * @param age this is the age required.
     */
    private static void greetWhenAdult(int age) {
        boolean isHappy = true;

        if (!isHungry) {
            if (isHappy && age >= 18) {
                System.out.println("Hello");
            }
        }

    }
}
