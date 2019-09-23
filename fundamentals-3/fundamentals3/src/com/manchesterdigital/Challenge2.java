package com.manchesterdigital;

public class Challenge2 {

    public static boolean lastDigit(int var1, int var2) {
        return var1 % 10 == var2 % 10;
    }


    public static void main(String[] args) {
        System.out.println(lastDigit(7, 17));
        System.out.println(lastDigit(6, 17));
        System.out.println(lastDigit(3, 113));
    }
}
