package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

interface ArrayOperations {

    static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .map(operand -> numbers[operand])
                .forEach(System.out::println);

        OptionalDouble result = IntStream.range(0, numbers.length)
                .map(operand -> numbers[operand])
                .average();
        return result.getAsDouble();
    };
}
