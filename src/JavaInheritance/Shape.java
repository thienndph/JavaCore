package JavaInheritance;

abstract class Shape {
        // Phương thức getPerimeter() của lớp JavaInheritance.Shape
        public abstract double getPerimeter();

        // Phương thức getArea() của lớp JavaInheritance.Shape
        public abstract double getArea();
    }

    // Lớp JavaInheritance.Circle kế thừa từ JavaInheritance.Shape
    class Circle extends Shape {
        private double radius;

        // Constructor để khởi tạo bán kính của hình tròn
        public Circle(double radius) {
            this.radius = radius;
        }

        // Ghi đè phương thức getPerimeter() để tính chu vi hình tròn
        @Override
        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }

        // Ghi đè phương thức getArea() để tính diện tích hình tròn
        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }
    }

