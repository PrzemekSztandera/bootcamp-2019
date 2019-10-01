package com.manchesterdigital;

public class FibonacciChallenge {

    public static void main(String[] args) {
        int n = 0;
        int m = 1;
        do {
            System.out.println(n);
            int sumOfTwo = n + m;
            n = m;
            m = sumOfTwo;

        } while(n < 21);
    }
}
