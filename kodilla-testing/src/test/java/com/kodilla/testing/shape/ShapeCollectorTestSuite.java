package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

@DisplayName("Shape Collector Suite")
class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    class TestSquares {
        @Test
        void testAddFigureSquare() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square = new Square(5.0);

            //When
            shapeCollector.addFigure(square);

            //Then
            Assertions.assertEquals(1, shapeCollector.getShapesQuantity());
        }

        @Test
        void testRemoveFigureSquareNotExisting() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square = new Square(5.0);

            //When
            boolean result = shapeCollector.removeFigure(square);

            //Then
            Assertions.assertFalse(result);
        }

        @Test
        void testRemoveFigureSquare() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square = new Square(5.0);
            shapeCollector.addFigure(square);

            //When
            shapeCollector.removeFigure(square);

            //Then
            Assertions.assertEquals(0, shapeCollector.getShapesQuantity());
        }

        @Test
        void testGetFigureSquare() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square = new Square(5.0);
            shapeCollector.addFigure(square);

            //When
            Shape retrievedShape = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(square, retrievedShape);
        }

        @Test
        void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square = new Square(5.0);
            shapeCollector.addFigure(square);
            ArrayList<Shape> shapeList= new ArrayList<>();
            shapeList.add(square);

            //When
            List<Shape> shapeResultList = shapeCollector.showFigures();

            //Then
            Assertions.assertEquals(shapeList.toString(), shapeResultList.toString());
        }
    }

    @Nested
    class TestCircles {
        @Test
        void testAddFigureCircle() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle(5.0);

            //When
            shapeCollector.addFigure(circle);

            //Then
            Assertions.assertEquals(1, shapeCollector.getShapesQuantity());
        }

        @Test
        void testRemoveFigureCircleNotExisting() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle(5.0);

            //When
            boolean result = shapeCollector.removeFigure(circle);

            //Then
            Assertions.assertFalse(result);
        }

        @Test
        void testRemoveFigureCircle() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Square(5.0);
            shapeCollector.addFigure(circle);

            //When
            shapeCollector.removeFigure(circle);

            //Then
            Assertions.assertEquals(0, shapeCollector.getShapesQuantity());
        }

        @Test
        void testGetFigureCircle() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Square(5.0);
            shapeCollector.addFigure(circle);

            //When
            Shape retrievedShape = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(circle, retrievedShape);
        }

        @Test
        void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Square(5.0);
            shapeCollector.addFigure(circle);
            ArrayList<Shape> shapeList= new ArrayList<>();
            shapeList.add(circle);

            //When
            List<Shape> shapeResultList = shapeCollector.showFigures();

            //Then
            Assertions.assertEquals(shapeList.toString(), shapeResultList.toString());
        }
    }

    @Nested
    class TestTriangles {
        @Test
        void testAddFigureTriangle() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape triangle = new Triangle(5.0, 3.0);

            //When
            shapeCollector.addFigure(triangle);

            //Then
            Assertions.assertEquals(1, shapeCollector.getShapesQuantity());
        }

        @Test
        void testRemoveFigureTriangleNotExisting() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape triangle = new Triangle(5.0, 3.0);

            //When
            boolean result = shapeCollector.removeFigure(triangle);

            //Then
            Assertions.assertFalse(result);
        }

        @Test
        void testRemoveFigureTriangle() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape triangle = new Triangle(5.0, 3.0);
            shapeCollector.addFigure(triangle);

            //When
            shapeCollector.removeFigure(triangle);

            //Then
            Assertions.assertEquals(0, shapeCollector.getShapesQuantity());
        }

        @Test
        void testGetFigureTriangle() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape triangle = new Triangle(5.0, 3.0);
            shapeCollector.addFigure(triangle);

            //When
            Shape retrievedShape = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(triangle, retrievedShape);
        }

        @Test
        void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape triangle = new Triangle(5.0, 3.0);
            shapeCollector.addFigure(triangle);
            ArrayList<Shape> shapeList= new ArrayList<>();
            shapeList.add(triangle);

            //When
            List<Shape> shapeResultList = shapeCollector.showFigures();

            //Then
            Assertions.assertEquals(shapeList.toString(), shapeResultList.toString());
        }
    }

}
