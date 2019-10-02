package com.manchesterdigital;

public class Toyota extends Vehicle implements Movement {
    public Toyota(String colour,
                  Integer numberOfSeats,
                  TransmissioType transmissioType,
                  Double engineSize,
                  String manufacture) {
        super(colour, numberOfSeats, transmissioType, engineSize, manufacture);
    }

    @Override
    public void moveForwards() {
        System.out.println("Moving Toyota forwards");
    }

    @Override
    public void reverse() {
        System.out.println("Moving Toyota backwards");
    }


}
