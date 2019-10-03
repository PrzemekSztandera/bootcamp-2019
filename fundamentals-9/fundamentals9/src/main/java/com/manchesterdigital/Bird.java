package com.manchesterdigital;

public abstract class Bird extends Animal {
    private String name = "Steve";
    private Integer wingspan;


    public Bird(Integer age, String gender, Integer weightInLbs, Integer wingspan) {
        super(age, gender, weightInLbs);
        this.wingspan = wingspan;
    }

}
