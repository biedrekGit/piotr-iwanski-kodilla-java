package com.kodilla.testing.shape;

class Triangle implements Shape {

    private double sideA;
    private double heightA;

    public Triangle(double sideA, double heightA) {
        this.sideA = sideA;
        this.heightA = heightA;
    }

    @Override
    public String getShapeName() {
        return "triangle";
    }

    @Override
    public double getField() {
        return (sideA * heightA) / 2;
    }

    public double getSideA() {
        return sideA;
    }

    public double getHeightA() {
        return heightA;
    }
}
