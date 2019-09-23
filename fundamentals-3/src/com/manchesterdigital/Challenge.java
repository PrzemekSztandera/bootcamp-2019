package com.manchesterdigital;

public class Challenge {

    public static void main(String[] args) {
        double number1 = 20d;
        double number2 = 80d;

        double result = (number1 + number2) * 25;
        double reminder = result % 40;
        System.out.println("Result: " + result + ", Reminder: " + reminder);

        if(reminder <= 20 ) {
            System.out.printf("Total was over the limit is %.3f", result);
        }
    }
}
