package JavaEncapsulation;

    public class Rectangle {
        // Private instance variables
        private double length;
        private double width;

        // Constructor
        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        // Getter for length
        public double getLength() {
            return length;
        }

        // Setter for length
        public void setLength(double length) {
            this.length = length;
        }

        // Getter for width
        public double getWidth() {
            return width;
        }

        // Setter for width
        public void setWidth(double width) {
            this.width = width;
        }
}
