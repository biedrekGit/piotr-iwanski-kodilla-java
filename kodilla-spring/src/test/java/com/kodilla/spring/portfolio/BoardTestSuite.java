package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board =  context.getBean(Board.class);
        //When
        board.addToDoTask("task1 - to do");
        board.addInProgressTask("task2 - in progress");
        board.addDoneTask("task3 - done");
        //Then
        board.showBoard();
    }
}
