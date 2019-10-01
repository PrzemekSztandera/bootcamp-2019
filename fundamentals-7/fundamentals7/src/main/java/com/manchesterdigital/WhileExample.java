package com.manchesterdigital;

public class WhileExample {

    public static void main(String[] args) {
        /**
         * while(boolean expression {
         *     // logic
         * }
         */

        double growthRate = 0.04; // 4%
        int population = 800; // initial population of puffins
        int year = 0; // i.e present time

        while(population <= 1200) {
            Double tempPopulation = population * (1 + growthRate);
            population = tempPopulation.intValue();
            year++;
        }

        System.out.println("year = " + year);
        System.out.println("population = " + population);
        averageAndSumOfNumber(100);
    }

    private static void averageAndSumOfNumber(int num) {
        int i = 1;
        int sum = 0;
        int average = 0;
        while(i <= num) {
            sum += i;
            average = sum/i;
            i++;
        }
        System.out.println("average = " + average);
        System.out.println("sum = " + sum);
    }
}
