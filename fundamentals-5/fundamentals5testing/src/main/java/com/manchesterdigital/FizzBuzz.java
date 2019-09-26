package com.manchesterdigital;

public class FizzBuzz {

    public static String checkFizzBuzz(int num) {
        String word = Integer.toString(num);
        if( num % 3 == 0 && num % 5 == 0) {
            word = "FizzBuzz";
        } else {
            if(num % 3 == 0) {
                word = "Fizz";
            } else if (num % 5 == 0) {
                word = "Buzz";
            }
        }
        return word;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,15};

        for (int i : arr) {
            System.out.println(checkFizzBuzz(i));
        }
    }
}
