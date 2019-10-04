package com.manchesterdigital;

public class FizzBuzz {
    public String printer(int number) {
        String word = "Fizz";
        if(number % 3 == 0 || Integer.toString(number).contains("3")) {
            return word;
        } else {
            word = "" + number;
        }



        return word;
    }
}
