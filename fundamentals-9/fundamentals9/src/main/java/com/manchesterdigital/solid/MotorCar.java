package com.manchesterdigital.solid;

public class MotorCar implements MoveVehicle, HasEngine {
    private Engine engine;

    @Override
    public void startEngine() {
        engine.on();
    }

    @Override
    public void accelerate() {
        engine.powerOn(1000);
    }
}
