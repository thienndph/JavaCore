package JavaEncapsulation;

public class Circle {
    // Private instance variable
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the perimeter (circumference) of the circle
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

