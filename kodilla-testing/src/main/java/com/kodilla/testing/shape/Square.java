package com.kodilla.testing.shape;

class Square implements Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String getShapeName() {
        return "square";
    }

    @Override
    public double getField() {
        return side * side;
    }

    public double getA() {
        return side;
    }

    @Override
    public String toString() {
        return String.format("%s (field: %.2f)", getShapeName(), getField());
    }
}
