package JavaAbstractClasses;

abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Phương thức trừu tượng
    abstract double calculateSalary();
    abstract void displayInfo();
}

// Lớp JavaAbstractClasses.Manager kế thừa từ JavaAbstractClasses.Employee
class Manager extends Employee {
    double basicSalary;
    double bonus;

    Manager(String name, int id, double basicSalary, double bonus) {
        super(name, id);
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    // Triển khai phương thức calculateSalary cho JavaAbstractClasses.Manager
    @Override
    double calculateSalary() {
        return basicSalary + bonus;
    }

    // Triển khai phương thức displayInfo cho JavaAbstractClasses.Manager
    @Override
    void displayInfo() {
        System.out.println("JavaAbstractClasses.Manager Name: " + name);
        System.out.println("JavaAbstractClasses.Manager ID: " + id);
        System.out.println("JavaAbstractClasses.Manager Salary: " + calculateSalary());
    }
}

// Lớp JavaAbstractClasses.Programmer kế thừa từ JavaAbstractClasses.Employee
class Programmer extends Employee {
    double basicSalary;
    double overtimePay;
    int overtimeHours;

    Programmer(String name, int id, double basicSalary, double overtimePay, int overtimeHours) {
        super(name, id);
        this.basicSalary = basicSalary;
        this.overtimePay = overtimePay;
        this.overtimeHours = overtimeHours;
    }

    // Triển khai phương thức calculateSalary cho JavaAbstractClasses.Programmer
    @Override
    double calculateSalary() {
        return basicSalary + (overtimePay * overtimeHours);
    }

    // Triển khai phương thức displayInfo cho JavaAbstractClasses.Programmer
    @Override
    void displayInfo() {
        System.out.println("JavaAbstractClasses.Programmer Name: " + name);
        System.out.println("JavaAbstractClasses.Programmer ID: " + id);
        System.out.println("JavaAbstractClasses.Programmer Salary: " + calculateSalary());
    }
}