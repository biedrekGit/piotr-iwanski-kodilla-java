package com.kodilla.exception.test;

public class FindFlightRunner {

    public static void main(String[] args) {
        FindFlight flightFinder = new FindFlight();
        Flight flight1 = new Flight("Berlin", "Tokyo");
        Flight flight2 = new Flight("Warsaw", "Zakopane");

        try {
            flightFinder.findFlight(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println("Route not found");
        }

        try {
            flightFinder.findFlight(flight2);
        } catch (RouteNotFoundException e) {
            System.out.println("Route not found");
        }

        System.out.println("Still working");
    }
}
