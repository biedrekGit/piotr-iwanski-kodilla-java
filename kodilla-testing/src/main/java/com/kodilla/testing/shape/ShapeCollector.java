package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

class ShapeCollector {

    private List<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapes.contains(shape)) {
            shapes.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        return shapes.get(n);
    }

    public String showFigures() {
        return shapes.toString();
    }

    public int getShapesQuantity() {
        return shapes.size();
    }

    @Override
    public String toString() {
        return "ShapeCollector{" +
                "shapes=" + shapes +
                '}';
    }

    public static void main(String[] args) {

        ShapeCollector collector = new ShapeCollector();

        Shape square = new Square(5.0);
        Shape circle = new Circle(5.0);
        Shape triangle = new Triangle(5.0,3.0);

        collector.addFigure(square);
        collector.addFigure(circle);
        collector.addFigure(triangle);

        System.out.println(collector.showFigures());
    }
}
