package JavaPolymorphism;

// Base class Shape
abstract class Shape8 {
    // Abstract method for drawing the shape
    abstract void draw();

    // Abstract method for calculating the area of the shape
    abstract double calculateArea();
}

// Subclass Circle
class Circle8 extends Shape8 {
    private double radius;

    // Constructor
    public Circle8(double radius) {
        this.radius = radius;
    }

    // Override draw method
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }

    // Override calculateArea method
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Subclass Square
class Square8 extends Shape8 {
    private double side;

    // Constructor
    public Square8(double side) {
        this.side = side;
    }

    // Override draw method
    @Override
    void draw() {
        System.out.println("Drawing a Square");
    }

    // Override calculateArea method
    @Override
    double calculateArea() {
        return side * side;
    }
}

// Subclass Triangle
class Triangle8 extends Shape8 {
    private double base;
    private double height;

    // Constructor
    public Triangle8(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Override draw method
    @Override
    void draw() {
        System.out.println("Drawing a Triangle");
    }

    // Override calculateArea method
    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}

