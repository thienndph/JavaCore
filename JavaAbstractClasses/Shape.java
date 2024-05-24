package JavaAbstractClasses;

// Lớp trừu tượng JavaAbstractClasses.Shape
abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    // Phương thức trừu tượng calculateArea()
    public abstract double calculateArea();

    // Phương thức trừu tượng calculatePerimeter()
    public abstract double calculatePerimeter();

    @Override
    public String toString() {
        return "Hình: " + name;
    }
}

// Lớp JavaAbstractClasses.Circle mở rộng từ JavaAbstractClasses.Shape
class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Lớp JavaAbstractClasses.Triangle mở rộng từ JavaAbstractClasses.Shape
class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(String name, double sideA, double sideB, double sideC) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculateArea() {
        // Sử dụng công thức Heron để tính diện tích tam giác
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}