package com.manchesterdigital;


public class Runner {

    public static void main(String[] args) {
        /*
        Boolean result = Utility.isEven(3);
        System.out.println(result);

        boolean equalNames = Utility.doNamesMatch("pRZEMEK", "Przemek");
        System.out.println(equalNames);

        Dog poodle = new Dog(20);
        System.out.println(poodle.bark());

        Dog rottweiler = new Dog(100);
        System.out.println(rottweiler.bark());
        */

        Long id;
        try {
            id = Utility.convertStringToLong("545e4545");
            System.out.println(id);
        } catch (NumberFormatException e) {
            //e.printStackTrace();
            System.out.println("Input provided was not valid number " + e);

            id = Long.MAX_VALUE;
        }
        System.out.println("My ID is: " + id);


        // don't do
        try {
            Long num = Utility.convertStringToLong("434");
        } catch (Throwable e) {
            // don't do this
        }

        // don't do this also
        try {
            Long num2 = Utility.convertStringToLong("53");
        } catch (NumberFormatException e) {
            System.err.println(e);
            throw e; // don't do this
        }

        try {
            Long num3 = Utility.convertStringToLong("fadsf");
        } finally {
            System.out.println("Errororororororo");
        }
    }
}
