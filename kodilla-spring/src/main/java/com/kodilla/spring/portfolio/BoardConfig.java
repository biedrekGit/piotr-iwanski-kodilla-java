package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Bean
    public Board getBoard() {
        return new Board(getTaskListOne(), getTaskListTwo(), getTaskListThree());
    }

    @Bean
    public TaskList getTaskListOne() {
        return new TaskList();
    }

    @Bean
    public TaskList getTaskListTwo() {
        return new TaskList();
    }

    @Bean
    public TaskList getTaskListThree() {
        return new TaskList();
    }
}
