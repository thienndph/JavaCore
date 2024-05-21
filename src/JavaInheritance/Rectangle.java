package JavaInheritance;

class Rectangle {
        private int width;
        private int height;

        // Constructor để khởi tạo đối tượng JavaInheritance.Rectangle với chiều rộng và chiều cao
        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        // Phương thức để tính diện tích của hình chữ nhật
        public int getArea() {
            return width * height;
        }
    }
