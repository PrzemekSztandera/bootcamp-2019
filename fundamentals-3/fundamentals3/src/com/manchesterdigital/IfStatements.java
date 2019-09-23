package com.manchesterdigital;

public class IfStatements {

    public static void main(String[] args) {
        /*
        if(condition) {

        }
         */

        int age = 50;
        if( age <= 29 ) {
            System.out.println("Age is over 20");
        } else if ( age > 30 ) {
            System.out.println("Age is over 30");
        } else {
            System.out.println("No it is not");
        }
    }
}
