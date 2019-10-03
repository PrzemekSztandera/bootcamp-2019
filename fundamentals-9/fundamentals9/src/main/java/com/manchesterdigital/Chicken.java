package com.manchesterdigital;

public class Chicken extends Bird {
    public Chicken(Integer age, String gender, Integer weightInLbs, Integer wingspan) {
        super(age, gender, weightInLbs, wingspan);
    }

    @Override
    public void move() {
        System.out.println("I am waddling...");
    }
}
