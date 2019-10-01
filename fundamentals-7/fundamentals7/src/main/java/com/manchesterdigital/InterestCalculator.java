package com.manchesterdigital;

public class InterestCalculator {

    public static void main(String[] args) {
        double amount = 100.00d;

        //for (int i = 0; i <= 10; i++) {
        //    System.out.println(calculateInterest(amount, i));
        //}

        int sum = 0;
        for (int i = 1; i <= 500; i++) {
            if(i%15==0){
                System.out.println("i = " + i);
                sum += i;
            }
        }
        System.out.println("Sum = " + sum);

        System.out.println(replicateString("Hello", 34));


    }

    private static double calculateInterest(double amount, int i) {
        return (amount * i) / 100;
    }

    private static StringBuilder replicateString(String string, int num) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < num; i++) {
            stringBuilder.append(string);
        }
        return stringBuilder;
    }
}
