package com.manchesterdigital;

public abstract class Vehicle {
    private final String colour;
    private final Integer numberOfSeats;
    private final TransmissioType transmissioType;
    private final Double engineSize;
    private final String manufacture;

    public Vehicle(String colour, Integer numberOfSeats, TransmissioType transmissioType, Double engineSize, String manufacture) {
        this.colour = colour;
        this.numberOfSeats = numberOfSeats;
        this.transmissioType = transmissioType;
        this.engineSize = engineSize;
        this.manufacture = manufacture;
    }

    //public abstract void supercharge();
}
