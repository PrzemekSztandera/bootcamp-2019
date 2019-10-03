package com.manchesterdigital;


public abstract class Animal {
    private Integer age;
    private String gender;
    private Integer weightInLbs;
    private String name = "John";

    public String getName() {
        return name;
    }

    public Animal(Integer age, String gender, Integer weightInLbs) {
        this.age = age;
        this.gender = gender;
        this.weightInLbs = weightInLbs;
    }

    public void eat() {
        System.out.println("Eating!!!");
    }

    public void sleep() {
        System.out.println("Sleeping... zzz");
    }

    public abstract void move();
}
