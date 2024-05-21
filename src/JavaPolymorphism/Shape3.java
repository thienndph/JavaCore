package JavaPolymorphism;

abstract class Shape3 {
    // Abstract methods getArea() and getPerimeter()
    public abstract double getArea();
    public abstract double getPerimeter();
}

// Subclass Circle extending Shape
class Circle2 extends Shape3 {
    private double radius;

    // Constructor
    public Circle2(double radius) {
        this.radius = radius;
    }

    // Override method getArea() for Circle
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Override method getPerimeter() for Circle
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Subclass Rectangle extending Shape
class Rectangle2 extends Shape3 {
    private double length;
    private double width;

    // Constructor
    public Rectangle2(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override method getArea() for Rectangle
    @Override
    public double getArea() {
        return length * width;
    }

    // Override method getPerimeter() for Rectangle
    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}

// Subclass Triangle extending Shape
class Triangle3 extends Shape3 {
    private double side1;
    private double side2;
    private double side3;

    // Constructor
    public Triangle3(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Override method getArea() for Triangle using Heron's formula
    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Override method getPerimeter() for Triangle
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}