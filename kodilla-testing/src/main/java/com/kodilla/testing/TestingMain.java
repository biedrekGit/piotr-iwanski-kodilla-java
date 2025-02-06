package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println();
        System.out.println("Test - pierwszy test jednostkowy:");
        Calculator calculator = new Calculator();
        int addResult = calculator.add(5, 14);
        int subtractResult = calculator.subtract(5,14);

        if (addResult == 5 + 14) {
            System.out.println("add test OK");
        } else {
            System.out.println("Error!");
        }

        if (subtractResult == 5 - 14) {
            System.out.println("subtract test OK");
        } else {
            System.out.println("Error!");
        }
    }
}
