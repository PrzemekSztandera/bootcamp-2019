package com.manchesterdigital;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Zoo {
    public static void main(String[] args) {
        /*
        Animal animal = new Animal(20, "Female", 100);
        animal.eat();
        animal.sleep();
         */

        Bird bird = new Chicken(23, "Male", 20, 10);
        Animal animal1 = new Chicken(23, "Male", 20, 10);

        System.out.println("Bird name: " + bird.getName());
        System.out.println("Animal name: " +  animal1.getName());

        Chicken bernardChicken = new Chicken(23, "Female", 15, 20);
        Magpie maggie = new Magpie(23, "Male", 50, 40);

        List<Animal> animals = new ArrayList<>();
        animals.add(maggie);
        animals.add(bernardChicken);

        for (Animal animal : animals) {
            animal.move();
        }

        Flyable someAnimalThatFlies = new Magpie(34, "Male", 56, 43);


    }
}
