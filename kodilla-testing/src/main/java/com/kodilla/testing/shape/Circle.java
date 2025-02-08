package com.kodilla.testing.shape;

class Circle implements Shape {

    private double range;

    public Circle(double range) {
        this.range = range;
    }


    @Override
    public String getShapeName() {
        return "circle";
    }

    @Override
    public double getField() {
        return Math.PI * Math.pow(range, 2);
    }

    public double getRange() {
        return range;
    }
}
