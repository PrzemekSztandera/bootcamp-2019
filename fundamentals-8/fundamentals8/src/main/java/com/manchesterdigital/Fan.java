package com.manchesterdigital;

public class Fan implements Control {

    @Override
    public void switchOn() {
        System.out.println("Switching on fan...");
    }

    @Override
    public void switchOff() {
        System.out.println("Switching off fan...");
    }
}
