package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {

    String name;
    List<Country> countryList = new ArrayList<>();

    public Continent(String name) {
        this.name = name;
    }

    public void addCountry(Country country) {
        countryList.add(country);
    }

    @Override
    public String toString() {
        return "Continent{" +
                "name='" + name + '\'' +
                ", countryList=" + countryList +
                '}';
    }
}
