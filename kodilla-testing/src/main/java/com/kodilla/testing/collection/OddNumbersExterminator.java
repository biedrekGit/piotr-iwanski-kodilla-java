package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

class OddNumbersExterminator {

    public static List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        if (numbers == null) {
            System.out.println("The list is empty.");
        } else {
            for (Integer i : numbers) {
                if (i % 2 == 0) {
                    result.add(i);
                }
            }
        }
        return result;
    }
}
