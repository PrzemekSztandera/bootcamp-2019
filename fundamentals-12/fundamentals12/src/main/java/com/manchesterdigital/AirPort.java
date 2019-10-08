package com.manchesterdigital;

import java.util.Optional;

public class AirPort {

    public static void main(String[] args) {
        FlightService flightService = new FlightService();
        FlightInformation flights = flightService.retrieveFlight("AB123");
        System.out.println("flights.getAirline().getName() = " + flights.getAirline().get().getName());

        // may have a flight info which could be null
        var flights1 = Optional.of(flights);

        // value of optional may be null but not to bothered
        var flights2 = Optional.ofNullable(flights);


    }
}
