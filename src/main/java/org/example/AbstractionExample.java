package org.example;

public class AbstractionExample {



    // Abstract class representing a shape
    abstract class Shape {
        // Abstract method to get the area (no implementation here)
        public abstract double calculateArea();

        // Concrete method shared by all subclasses
        public void displayArea() {
            System.out.println("Area: " + calculateArea());
        }
    }

    // Concrete subclass representing a circle
    class Circle extends Shape {
        private double radius;

        // Constructor
        public Circle(double radius) {
            this.radius = radius;
        }

        // Implementation of the abstract method for calculating the area of a circle
        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

    // Concrete subclass representing a rectangle
    class Rectangle extends Shape {
        private double length;
        private double width;

        // Constructor
        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        // Implementation of the abstract method for calculating the area of a rectangle
        @Override
        public double calculateArea() {
            return length * width;
        }
    }

    // Main class to demonstrate abstraction
    public class abstractionExample {
        public void main(String[] args) {
            // Creating objects of concrete subclasses
            Circle circle = new Circle(5.0);
            Rectangle rectangle = new Rectangle(4.0, 6.0);

            // Using abstract class reference to achieve abstraction
            Shape shape1 = circle;
            Shape shape2 = rectangle;

            // Calling abstract method (polymorphism)
            shape1.displayArea(); // Output: Area: 78.53981633974483
            shape2.displayArea(); // Output: Area: 24.0
        }
    }
}
