package JavaAbstractClasses;

abstract class Vehicle {
    // Phương thức trừu tượng
    abstract void startEngine();
    abstract void stopEngine();
}

// Lớp JavaAbstractClasses.Car kế thừa từ JavaAbstractClasses.Vehicle
class Car extends Vehicle {
    // Triển khai phương thức startEngine cho JavaAbstractClasses.Car
    @Override
    void startEngine() {
        System.out.println("JavaAbstractClasses.Car engine started.");
    }

    // Triển khai phương thức stopEngine cho JavaAbstractClasses.Car
    @Override
    void stopEngine() {
        System.out.println("JavaAbstractClasses.Car engine stopped.");
    }
}

// Lớp JavaAbstractClasses.Motorcycle kế thừa từ JavaAbstractClasses.Vehicle
class Motorcycle extends Vehicle {
    // Triển khai phương thức startEngine cho JavaAbstractClasses.Motorcycle
    @Override
    void startEngine() {
        System.out.println("JavaAbstractClasses.Motorcycle engine started.");
    }

    // Triển khai phương thức stopEngine cho JavaAbstractClasses.Motorcycle
    @Override
    void stopEngine() {
        System.out.println("JavaAbstractClasses.Motorcycle engine stopped.");
    }
}