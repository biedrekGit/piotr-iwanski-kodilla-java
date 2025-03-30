package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TaskFactoryTestSuite {

    @Test
    void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVINGTASK);
        String executeTask = drivingTask.executeTask();
        //Then
        assertEquals("Driving Task", drivingTask.getTaskName());
        assertEquals("Drive home (by car)", executeTask);
        assertTrue(drivingTask.isTaskExecuted());
    }

    @Test
    void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTINGTASK);
        String executeTask = paintingTask.executeTask();
        //Then
        assertEquals("Painting Task", paintingTask.getTaskName());
        assertEquals("Paint wall (in green)", executeTask);
        assertTrue(paintingTask.isTaskExecuted());
    }

    @Test
    void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPINGTASK);
        String executeTask = shoppingTask.executeTask();
        //Then
        assertEquals("Shopping Task", shoppingTask.getTaskName());
        assertEquals("Buy bread (1.0)", executeTask);
        assertTrue(shoppingTask.isTaskExecuted());
    }


}
