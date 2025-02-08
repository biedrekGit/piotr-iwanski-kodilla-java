package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("when create empty list" +
            "then exterminate should return empty list")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> list = Arrays.asList();
        //When
        List<Integer> test = OddNumbersExterminator.exterminate(list);
        System.out.println("Testing: " + list);
        List<Integer> expectedResult = new ArrayList<>();
        //Then
        Assertions.assertIterableEquals(expectedResult, test);
    }

    @DisplayName("when create normal list" +
            "then exterminate should return even integers only list")
    @Test
    void testOddNumbersExterminatorNormalLis() {
        //Given
        List<Integer> list = Arrays.asList(0,1,2,3,4,5,6,7,13,56,231,413);
        //When
        List<Integer> test = OddNumbersExterminator.exterminate(list);
        System.out.println("Testing: " + list);
        List<Integer> expectedResult = Arrays.asList(0,2,4,6,56);
        //Then
        Assertions.assertIterableEquals(expectedResult, test);
    }
}
