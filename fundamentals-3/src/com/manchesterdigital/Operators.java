package com.manchesterdigital;

public class Operators {

    public static void main(String[] args) {
        // post increment:
        int result  = 0;

        // post - increment
        result++;
        // pre - increment
        ++result;
        // post - decrement
        result--;
        // pre - decrement
        -- result;

        // addtion operator in an abbreviated way;
        result += 3;
        result = result - 10;

        result -= 10;
        result *= 20;

        boolean isRainingToday = false;
        if (!isRainingToday) {
            System.out.println("You won't need a jacket today");
        }

        int number1 = 100;
        int number2 = 200;

        if (number1 != number2) {
            System.out.println("Same!!");
        }


        if (number1 == number2) {
            System.out.println("Whooo");
        }

        int degreeScore = 50;
        int anotherScore = 100;

        if(degreeScore <= 50 || anotherScore >=200) {
            System.out.println("Something");
        }

        String lastName = "Sousa";
        if (lastName.equalsIgnoreCase("SOUSA")) {
            System.out.println("Surname is Sousa!");
        }

        int numberOfMealsToday = 1;

        // example of ternary operator
        boolean isHungry = numberOfMealsToday == 1 ? true : false;
    }

}
