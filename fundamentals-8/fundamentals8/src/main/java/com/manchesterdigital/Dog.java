package com.manchesterdigital;

public class Dog {

    private String name;
    private String gender;
    private Integer age;
    private String breed;
    private String weight;
    private Integer aggressionLevel;
    private DogSize dogSize;
    private Integer hungerLevel;

    public Dog(DogSize dogSize) {
        this.dogSize = dogSize;
    }

    public void bark() {
        System.out.println(dogSize.getNoise());
    }

    public void hungry() {
        if(hungerLevel > 10) {
            for (int i = 0; i < 10; i++) {
                bark();
            }
            System.out.println("Gimme food!! " + dogSize.getNoise());
        }
        else {
            System.out.println("Im stuffed");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setAggressionLevel(Integer aggressionLevel) {
        this.aggressionLevel = aggressionLevel;
    }

    public void setHungerLevel(Integer hungerLevel) {
        this.hungerLevel = hungerLevel;
    }
}
