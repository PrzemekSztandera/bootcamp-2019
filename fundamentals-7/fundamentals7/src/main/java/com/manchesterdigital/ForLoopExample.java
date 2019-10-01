package com.manchesterdigital;

public class ForLoopExample {
    /**
     * for (initialization; boolean expression; update statement) {
     *     one or more lines of logic
     * }
     */

    public static void main(String[] args) {
        for(int i = 0; i <= 100; i++) {
            System.out.println("i = " + i);
        }

        int x = 0;
        for (; x <= 100; x++) {
            System.out.println("x = " + x);
        }
        System.out.println("x = " + x);

        // infinitive loop
        /*
        for(;;) {

        }
         */


    }
}
