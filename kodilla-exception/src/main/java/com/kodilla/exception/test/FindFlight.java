package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Warsaw", true);
        flightMap.put("Berlin", true);
        flightMap.put("Chicago", false);
        flightMap.put("Tokyo", false);

        String departureAirport = flight.getDepartureAirport();
        String arrivalAirport = flight.getArrivalAirport();

        if (flightMap.containsKey(departureAirport)) {
            boolean flightAvailable = flightMap.get(departureAirport);
            System.out.println(flightAvailable ?
                    "Flight from " + departureAirport + " is available" :
                    "Flight from " + departureAirport + " is not available at this moment");

        } else {
            throw new RouteNotFoundException("Route not found");
        }

        if (flightMap.containsKey(arrivalAirport)) {
            boolean flightAvailable = flightMap.get(arrivalAirport);
            System.out.println(flightAvailable ?
                    "Flight to " + arrivalAirport + " is available" :
                    "Flight to " + arrivalAirport + " is not available at this moment");
        } else {
            throw new RouteNotFoundException("Route not found");
        }
    }
}
