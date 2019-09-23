package com.manchesterdigital;

public class Challenge3 {

    public static int printWeekDay (int day) {
        if(day >= 1 && day <= 5) {
            System.out.println("Weekday");
        }
        return day;
    }

    public static void main(String[] args) {

        int weekDay = printWeekDay(2);

        if( weekDay == 2 || weekDay == 4) {
            System.out.println("I go to the gym");
        } else if ( weekDay == 7) {
            System.out.println("I do the gardening");
        }
    }
}
