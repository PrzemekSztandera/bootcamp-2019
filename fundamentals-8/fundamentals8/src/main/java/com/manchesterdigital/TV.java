package com.manchesterdigital;

public class TV extends ElectricalDevice implements Volume, StandBy {
    @Override
    public void standByMode() {
        System.out.println("Going into standby mode");
    }

    @Override
    void switchOn() {
        System.out.println("TV switching on...");
    }

    @Override
    void switchOff() {
        System.out.println("TV switching off...");
    }
}
