package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String DRIVINGTASK = "DRIVINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String SHOPPINGTASK = "SHOPPINGTASK";

    public final Task makeTask(final String taskClass) {
        return switch (taskClass) {
            case DRIVINGTASK -> new DrivingTask("Driving Task", "home", "car");
            case PAINTINGTASK -> new PaintingTask("Painting Task", "green", "wall");
            case SHOPPINGTASK -> new ShoppingTask("Shopping Task", "bread", 1.0);
            default -> null;
        };
    }
}
