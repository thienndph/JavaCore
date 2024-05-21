package JavaPolymorphism;


    abstract class GeometricShape {
        // Phương thức trừu tượng để tính diện tích
        public abstract double area();

        // Phương thức trừu tượng để tính chu vi
        public abstract double perimeter();
    }

    // Lớp Triangle (Tam giác) mở rộng từ lớp GeometricShape
    class Triangle extends GeometricShape {
        private double side1;
        private double side2;
        private double side3;

        // Constructor
        public Triangle(double side1, double side2, double side3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

        @Override
        public double area() {
            // Sử dụng công thức Heron để tính diện tích của tam giác
            double s = (side1 + side2 + side3) / 2;
            return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        }

        @Override
        public double perimeter() {
            return side1 + side2 + side3;
        }
    }

    // Lớp Square (Hình vuông) mở rộng từ lớp GeometricShape
    class Square extends GeometricShape {
        private double side;

        // Constructor
        public Square(double side) {
            this.side = side;
        }

        @Override
        public double area() {
            return side * side;
        }

        @Override
        public double perimeter() {
            return 4 * side;
        }
    }

