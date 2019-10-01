package com.manchesterdigital;

public class DoWhileExample {

    public static void main(String[] args) {
        /**
         * do {
         *    // logic
         * } while (boolean expression);
         *
         */
        boolean isLying = false;
        do {
            System.out.println("Cant wait for the day to finish");
        } while (isLying);

        int i = 1;
        do {
            System.out.println("i = " + i++);
        } while ( i < 7 );
    }
}
