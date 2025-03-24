package com.kodilla.spring.portfolio;

public class Board {

    TaskList toDoList;
    TaskList inProgressList;
    TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public void addToDoTask(String string) {
        this.toDoList.addTask(string);
    }

    public void addInProgressTask(String string) {
        this.inProgressList.addTask(string);
    }

    public void addDoneTask(String string) {
        this.doneList.addTask(string);
    }

    public void showBoard() {
        System.out.println("Tasks to do: ");
        toDoList.showTasks();
        System.out.println("Tasks in progress: ");
        inProgressList.showTasks();
        System.out.println("Tasks done: ");
        doneList.showTasks();
    }
}
