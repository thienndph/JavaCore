package JavaEncapsulation;

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
                System.out.print("Chọn một tùy chọn: ");

                String option = scanner.nextLine();

                switch (option) {
                    case "1":
                        System.out.println("Bài 1 được chọn.");
                        Person person = new Person("John Doe", 30, "USA");


                        System.out.println("Name: " + person.getName());
                        System.out.println("Age: " + person.getAge());
                        System.out.println("Country: " + person.getCountry());

                        person.setName("Jane Doe");
                        person.setAge(28);
                        person.setCountry("Canada");

                        System.out.println("Updated Name: " + person.getName());
                        System.out.println("Updated Age: " + person.getAge());
                        System.out.println("Updated Country: " + person.getCountry());
                        break;
                    case "2":
                        System.out.println("Bài 2 được chọn.");
                        BankAccount account = new BankAccount("123456789", 1000.00);

                        System.out.println("Account Number: " + account.getAccountNumber());
                        System.out.println("Balance: $" + account.getBalance());

                        account.setAccountNumber("987654321");
                        account.setBalance(5000.00);

                        System.out.println("Updated Account Number: " + account.getAccountNumber());
                        System.out.println("Updated Balance: $" + account.getBalance());
                        break;
                    case "3":
                        System.out.println("Bài 3 được chọn.");
                        Rectangle rectangle = new Rectangle(5.0, 3.0);

                        System.out.println("Length: " + rectangle.getLength());
                        System.out.println("Width: " + rectangle.getWidth());

                        rectangle.setLength(10.0);
                        rectangle.setWidth(6.0);

                        System.out.println("Updated Length: " + rectangle.getLength());
                        System.out.println("Updated Width: " + rectangle.getWidth());
                        break;
                    case "4":
                        System.out.println("Bài 4 được chọn.");
                        Employee employee = new Employee(1, "John Doe", 50000.00);

                        System.out.println("Employee ID: " + employee.getEmployeeId());
                        System.out.println("Employee Name: " + employee.getEmployeeName());
                        System.out.println("Employee Salary: " + employee.getEmployeeSalary());


                        employee.setEmployeeId(2);
                        employee.setEmployeeName("Jane Smith");

                        System.out.println("Updated Employee ID: " + employee.getEmployeeId());
                        System.out.println("Updated Employee Name: " + employee.getEmployeeName());
                        System.out.println("Updated Employee Salary: " + employee.getEmployeeSalary());
                        break;
                    case "5":
                        System.out.println("Bài 5 được chọn.");
                        Circle circle = new Circle(5.0);

                        System.out.println("Radius: " + circle.getRadius());
                        System.out.println("Area: " + circle.calculateArea());
                        System.out.println("Perimeter: " + circle.calculatePerimeter());

                        circle.setRadius(10.0);

                        System.out.println("Updated Radius: " + circle.getRadius());
                        System.out.println("Updated Area: " + circle.calculateArea());
                        System.out.println("Updated Perimeter: " + circle.calculatePerimeter());
                        break;
                    case "6":
                        System.out.println("Bài 6 được chọn.");
                        Car car = new Car("Toyota", "Corolla", 2020, 15000.0);

                        System.out.println("Company Name: " + car.getCompanyName());
                        System.out.println("Model Name: " + car.getModelName());
                        System.out.println("Year: " + car.getYear());
                        System.out.println("Mileage: " + car.getMileage());

                        car.setCompanyName("Honda");
                        car.setModelName("Civic");
                        car.setYear(2022);

                        System.out.println("Updated Company Name: " + car.getCompanyName());
                        System.out.println("Updated Model Name: " + car.getModelName());
                        System.out.println("Updated Year: " + car.getYear());
                        System.out.println("Mileage: " + car.getMileage());
                        break;
                    case "7":
                        System.out.println("Bài 7 được chọn.");
                        Student student = new Student(1, "Alice Smith");

                        System.out.println("Student ID: " + student.getStudentId());
                        System.out.println("Student Name: " + student.getStudentName());

                        student.setStudentId(2);
                        student.setStudentName("Bob Johnson");

                        System.out.println("Updated Student ID: " + student.getStudentId());
                        System.out.println("Updated Student Name: " + student.getStudentName());

                        student.addGrade(95);  // Valid
                        student.addGrade(85);  // Valid grade
                        student.addGrade(150); // Invalid grade

                        System.out.println("Grades: " + student.getGrades());
                        break;
                    case "exit":
                        exit = true;
                        System.out.println("Thoát chương trình.");
                        break;
                }
            }
        }
    }