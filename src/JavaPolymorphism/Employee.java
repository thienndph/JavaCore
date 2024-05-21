package JavaPolymorphism;

class Employee {
    // Method to calculate salary (default implementation)
    public double calculateSalary() {
        return 0.0;
    }
}

// Subclass Manager extending Employee
class Manager extends Employee {
    private double baseSalary;

    // Constructor
    public Manager(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Override method to calculate salary for Manager
    @Override
    public double calculateSalary() {
        // Manager's salary calculation can include additional benefits or bonuses
        // For simplicity, let's just return the base salary
        return baseSalary;
    }
}

// Subclass Programmer extending Employee
class Programmer extends Employee {
    private double monthlySalary;

    // Constructor
    public Programmer(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    // Override method to calculate salary for Programmer
    @Override
    public double calculateSalary() {
        // Programmer's salary calculation can be based on monthly salary
        // For simplicity, let's just return the monthly salary
        return monthlySalary;
    }
}
