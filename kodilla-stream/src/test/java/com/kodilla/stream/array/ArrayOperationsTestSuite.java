package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayOperationsTestSuite {

    @Test
    void testGetAverageUsingIntStream() {
        //Given
        int[] numbers = new int[]{12,42,523,132,423,242,16,753,34,63,52};

        //When
        double testResult = ArrayOperations.getAverage(numbers);
        double expectedResult = (double) (12 + 42 + 523 + 132 + 423 + 242 + 16 + 753 + 34 + 63 + 52) / 11;

        //Then
        assertEquals(expectedResult,testResult);

    }
}
