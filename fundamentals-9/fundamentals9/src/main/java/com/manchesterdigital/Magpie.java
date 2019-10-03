package com.manchesterdigital;

public class Magpie extends Bird implements Flyable {

    public Magpie(Integer age, String gender, Integer weightInLbs, Integer wingspan) {
        super(age, gender, weightInLbs, wingspan);
    }


    @Override
    public void fly() {
        System.out.println("I believe I can fly...");
    }

    @Override
    public void move() {
        System.out.println("I am flapping...");
    }
}
