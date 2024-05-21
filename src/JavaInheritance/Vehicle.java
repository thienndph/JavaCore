package JavaInheritance;

class Vehicle {
        // Phương thức drive của lớp JavaInheritance.Vehicle
        public void drive() {
            System.out.println("Driving the vehicle");
        }
    }

    // Lớp con JavaInheritance.Car kế thừa từ JavaInheritance.Vehicle
    class Car extends Vehicle {
        // Ghi đè phương thức drive của lớp JavaInheritance.Vehicle
        @Override
        public void drive() {
            System.out.println("Sửa xe");
        }
    }
