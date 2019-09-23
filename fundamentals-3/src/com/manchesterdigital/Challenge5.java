package com.manchesterdigital;

public class Challenge5 {

    static int luckySum(int one, int two, int three) {

        if (three == 13) {
            return one + two;
        } else if ( two == 13 ) {
            return one;
        } else if (one == 13) {
            return 0;
        } else {
            return one + two + three;
        }
    }

    public static void main(String[] args) {
        System.out.println(luckySum(1, 9, 13));
    }
}
