package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.time.LocalDate.*;

public class StreamMain {

    public static void main(String[] args) {
        /*

        System.out.println("CHAPTER 7.1");
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


        System.out.println();
        System.out.println("CHAPTER 7.2");
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

        System.out.println();
        System.out.println("CHAPTER 7.3");
        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);

         */

        System.out.println();
        System.out.println("TASK 7.3");
        Forum theForum = new Forum();

        Map<Integer, ForumUser> theResultMapOfForumUsers = theForum.getUserList().stream()
                .filter(forumUser -> forumUser.getGender() == 'M')
                .filter(forumUser -> forumUser.getPostCount() > 0)
                .filter(forumUser -> Period.between(forumUser.getBirthDate(), now()).getYears() > 20)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser ));

        System.out.println("# elements: " + theResultMapOfForumUsers.size());
        theResultMapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);


    }
}
