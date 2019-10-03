package com.manchesterdigital.solid;

public class ElectricCar implements MoveVehicle {
    private Engine engine;

    @Override
    public void accelerate() {
        engine.powerOn(3000);
    }
}
