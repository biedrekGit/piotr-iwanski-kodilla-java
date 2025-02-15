package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        //task 7.1
        System.out.println();
        System.out.println("Task 7.1");
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println("Using poem beautifier: ");
        poemBeautifier.beautify("StringOne", (string -> string.toLowerCase()));
        poemBeautifier.beautify("StringTwo", (string -> string.toUpperCase()));
        poemBeautifier.beautify("StringThree", (string -> string.repeat(2)));
        poemBeautifier.beautify("StringFour", (string -> "ABC" + string));
        poemBeautifier.beautify("StringFive", (string -> string + "ABC"));
        poemBeautifier.beautify("StringSix", (string -> string.substring(3)));
        poemBeautifier.beautify("StringSeven", (string -> string.replaceAll("S", "XXX")));


    }
}
