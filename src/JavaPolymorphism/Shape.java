package JavaPolymorphism;

class Shape {
    // Phương thức CalculateArea() mặc định
    public void calculateArea() {
        System.out.println("Phương thức tính diện tích của hình dạng.");
    }
}

// Lớp Circle (Hình tròn) kế thừa từ lớp Shape
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Ghi đè phương thức calculateArea() của lớp cha
    @Override
    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Diện tích của hình tròn là: " + area);
    }
}

// Lớp Rectangle (Hình chữ nhật) kế thừa từ lớp Shape
class Rectangle extends Shape {
    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Ghi đè phương thức calculateArea() của lớp cha
    @Override
    public void calculateArea() {
        double area = width * height;
        System.out.println("Diện tích của hình chữ nhật là: " + area);
    }
}

// Lớp Triangle (Hình tam giác) kế thừa từ lớp Shape
class Triangle2 extends Shape {
    private double base;
    private double height;

    // Constructor
    public Triangle2(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Ghi đè phương thức calculateArea() của lớp cha
    @Override
    public void calculateArea() {
        double area = 0.5 * base * height;
        System.out.println("Diện tích của hình tam giác là: " + area);
    }
}
