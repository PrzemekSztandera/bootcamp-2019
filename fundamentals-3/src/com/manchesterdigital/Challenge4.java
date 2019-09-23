package com.manchesterdigital;

public class Challenge4 {

    public static boolean satisfied(int style, int bribe) {

        return (style >= 8 && bribe >= 5);
    }

    public static void main(String[] args) {

        String string =  satisfied(7, 9) ? "Allowed" : "Not Allowed";
        System.out.println(string);
    }
}
