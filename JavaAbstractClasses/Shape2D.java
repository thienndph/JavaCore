package JavaAbstractClasses;

abstract class Shape2D {
    // Phương thức trừu tượng draw
    public abstract void draw();

    // Phương thức trừu tượng resize
    public abstract void resize(double factor);
}

// Lớp Rectangle (Hình chữ nhật) mở rộng từ lớp Shape2D
class Rectangle extends Shape2D {
    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Vẽ hình chữ nhật với chiều rộng " + width + " và chiều cao " + height);
    }

    @Override
    public void resize(double factor) {
        width *= factor;
        height *= factor;
        System.out.println("Đã thay đổi kích thước của hình chữ nhật. Chiều rộng: " + width + ", chiều cao: " + height);
    }
}

// Lớp Circle (Hình tròn) mở rộng từ lớp Shape2D
class Circle2 extends Shape2D {
    private double radius;

    // Constructor
    public Circle2(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Vẽ hình tròn với bán kính " + radius);
    }

    @Override
    public void resize(double factor) {
        radius *= factor;
        System.out.println("Đã thay đổi kích thước của hình tròn. Bán kính: " + radius);
    }
}