package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        Country country1 = new Country("Poland", new BigDecimal("36600000"));
        Country country2 = new Country("France", new BigDecimal("68440000"));
        Country country3 = new Country("Germany", new BigDecimal("84700000"));
        Country country4 = new Country("China", new BigDecimal("1408000000"));
        Country country5 = new Country("South Korea", new BigDecimal("51750000"));
        Country country6 = new Country("Japan", new BigDecimal("124000000"));
        Country country7 = new Country("USA", new BigDecimal("341000000"));
        Country country8 = new Country("Canada", new BigDecimal("41500000"));
        Country country9 = new Country("Mexico", new BigDecimal("128000000"));
        Continent europe = new Continent("Europe");
        europe.addCountry(country1);
        europe.addCountry(country2);
        europe.addCountry(country3);
        Continent asia = new Continent("Asia");
        asia.addCountry(country4);
        asia.addCountry(country5);
        asia.addCountry(country6);
        Continent northAmerica = new Continent("North America");
        northAmerica.addCountry(country7);
        northAmerica.addCountry(country8);
        northAmerica.addCountry(country9);
        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(northAmerica);

        //when
        BigDecimal testResult = world.getPeopleQuantity();
        BigDecimal expectedResult = new BigDecimal("2283990000");

        //Then
        assertEquals(expectedResult, testResult);
    }
}
