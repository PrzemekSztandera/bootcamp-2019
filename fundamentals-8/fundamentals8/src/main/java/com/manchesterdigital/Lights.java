package com.manchesterdigital;

public class Lights implements Control {

    @Override
    public void switchOn() {
        System.out.println("Pressing on switch ... Switching on");
    }

    @Override
    public void switchOff() {
        System.out.println("Pressing off switch ... Switching off");
    }
}
