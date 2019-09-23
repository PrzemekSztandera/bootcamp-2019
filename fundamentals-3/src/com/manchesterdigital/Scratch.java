package com.manchesterdigital;

public class Scratch {
    public static void main(String[] args) {
        // assigment statement(declarative statement)
        int numberOfTeams = 4;

        // declarative statement
        double interestRate;

        // method invocation statement
        System.out.println("Hello World");

        // object creation statement
        Car ferrari = new Car();

        boolean isMorning = true;
        if(isMorning) {
            System.out.println("It's morning");
            putTheKettleOn();
        }


//        putTheKettleOn();
    }

    private static void putTheKettleOn() {
        System.out.println("Putting kettle on...");
    }
}
