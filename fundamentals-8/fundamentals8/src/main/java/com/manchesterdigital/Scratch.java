package com.manchesterdigital;

import java.util.ArrayList;
import java.util.List;

public class Scratch {
    public static final String RED_COLOR = "RED";
    public static void main(String[] args) {
        System.out.println("Colour " + RED_COLOR);
        System.out.println(RainbowColours.BLUE);

        OrderProcessor orderProcessor = new OrderProcessor(OrderStatus.AWAITING_PAYMENT);
        orderProcessor.obtainCurrentOrderStatus();
        orderProcessor.printOrderMessage();

        Dog poodle = new Dog(DogSize.SMALL);
        poodle.setHungerLevel(100);
        poodle.hungry();

        Dog labrador = new Dog(DogSize.LARGE);
        labrador.bark();
        Address address = new Address("1st Street", "Mnchester", "M23 4TT");
        //Person person =  new Person("Jill", "Jones", 34, address);

       // person.printAddress();

        Lights lights = new Lights();
        Fan fan = new Fan();
        List<Control> controls = new ArrayList<>();
        controls.add(lights);
        controls.add(fan);

        for (Control control: controls) {
            control.switchOn();
            control.switchOff();

        }

    }
}
