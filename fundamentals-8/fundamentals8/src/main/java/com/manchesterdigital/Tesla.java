package com.manchesterdigital;

public class Tesla extends Vehicle implements Movement, IsChargable {
    public Tesla(String colour, Integer numberOfSeats, TransmissioType transmissioType, Double engineSize, String manufacture) {
        super(colour, numberOfSeats, transmissioType, engineSize, manufacture);
    }

    @Override
    public void moveForwards() {
        System.out.println("Moving Tesla forwards");
    }

    @Override
    public void reverse() {
        System.out.println("Moving Tesla backwards");
    }

    @Override
    public void supercharge() {
        System.out.println("Supercharging!!!");
    }


}
