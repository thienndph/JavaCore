package JavaPolymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu:");
            System.out.println(" Bài 1");
            System.out.println(" Bài 2");
            System.out.println(" Bài 3");
            System.out.println(" Bài 4");
            System.out.println(" Bài 5");
            System.out.println(" Bài 6");
            System.out.println(" Bài 7");
            System.out.println(" Bài 8");
            System.out.println(" Bài 9");
            System.out.println(" Bài 10");
            System.out.println(" Bài 11");
            System.out.println(" Bài 12");
            System.out.print("Chọn một tùy chọn: ");

            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    System.out.println("Bài 1 được chọn.");
                    GeometricShape triangle = new Triangle(3, 4, 5);
                    System.out.println("Diện tích của tam giác: " + triangle.area());
                    System.out.println("Chu vi của tam giác: " + triangle.perimeter());

                    GeometricShape square = new Square(4);
                    System.out.println("Diện tích của hình vuông: " + square.area());
                    System.out.println("Chu vi của hình vuông: " + square.perimeter());
                    break;
                case "2":
                    System.out.println("Bài 2 được chọn.");
                    Car car = new Car();
                    car.speedUp();

                    Bicycle bicycle = new Bicycle();
                    bicycle.speedUp();
                    break;
                case "3":
                    System.out.println("Bài 3 được chọn.");
                    Circle circle = new Circle(5);
                    circle.calculateArea();

                    Rectangle rectangle = new Rectangle(4, 6);
                    rectangle.calculateArea();

                    Triangle2 triangle2 = new Triangle2(3, 4);
                    triangle2.calculateArea();
                    break;
                case "4":
                    System.out.println("Bài 4 được chọn.");
                    Manager manager = new Manager(5000);
                    System.out.println("Manager's salary: $" + manager.calculateSalary());

                    Programmer programmer = new Programmer(3000);
                    System.out.println("Programmer's salary: $" + programmer.calculateSalary());
                    break;
                case "5":
                    System.out.println("Bài 5 được chọn.");
                    Sports football = new Football();
                    football.play();

                    Sports basketball = new Basketball();
                    basketball.play();

                    Sports rugby = new Rugby();
                    rugby.play();
                    break;
                case "6":
                    System.out.println("Bài 6 được chọn.");
                    Circle2 circle2 = new Circle2(5);
                    System.out.println("Area of Circle: " + circle2.getArea());
                    System.out.println("Perimeter of Circle: " + circle2.getPerimeter());

                    Rectangle2 rectangle2 = new Rectangle2(4, 6);
                    System.out.println("Area of Rectangle: " + rectangle2.getArea());
                    System.out.println("Perimeter of Rectangle: " + rectangle2.getPerimeter());

                    Triangle3 triangle3 = new Triangle3(3, 4, 5);
                    System.out.println("Area of Triangle: " + triangle3.getArea());
                    System.out.println("Perimeter of Triangle: " + triangle3.getPerimeter());
                    break;
                case "7":
                    System.out.println("Bài 7 được chọn.");
                    Bird bird = new Bird();
                    Panthera panthera = new Panthera();

                    System.out.println("Bird:");
                    bird.move();
                    bird.makeSound();

                    System.out.println("\nPanthera:");
                    panthera.move();
                    panthera.makeSound();
                    break;
                case "8":
                    System.out.println("Bài 8 được chọn.");
                    Shape8 circle8 = new Circle8(5);
                    Shape8 square8 = new Square8(4);
                    Shape8 triangle8 = new Triangle8(3, 6);

                    circle8.draw();
                    System.out.println("Area of Circle: " + circle8.calculateArea());

                    square8.draw();
                    System.out.println("Area of Square: " + square8.calculateArea());

                    triangle8.draw();
                    System.out.println("Area of Triangle: " + triangle8.calculateArea());
                    break;
                case "9":
                    System.out.println("Bài 9 được chọn.");
                    // Thực hiện hành động cho Bài 9
                    break;
                case "10":
                    System.out.println("Bài 10 được chọn.");
                    // Thực hiện hành động cho Bài 10
                    break;
                case "11":
                    System.out.println("Bài 11 được chọn.");
                    // Thực hiện hành động cho Bài 11
                    break;
                case "12":
                    System.out.println("Bài 12 được chọn.");
                    // Thực hiện hành động cho Bài 12
                    break;
                case "exit":
                    exit = true;
                    System.out.println("Thoát chương trình.");
                    break;

            }
        }
    }
}