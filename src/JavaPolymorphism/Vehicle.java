package JavaPolymorphism;


    class Vehicle {
        // Phương thức speedUp() mặc định
        public void speedUp() {
            System.out.println("Tăng tốc độ của phương tiện.");
        }
    }

    // Lớp Car (Xe hơi) kế thừa từ lớp Vehicle
    class Car extends Vehicle {
        // Ghi đè phương thức speedUp() của lớp cha
        @Override
        public void speedUp() {
            System.out.println("Xe hơi tăng tốc bằng cách đạp ga.");
        }
    }

    // Lớp Bicycle (Xe đạp) kế thừa từ lớp Vehicle
    class Bicycle extends Vehicle {
        // Ghi đè phương thức speedUp() của lớp cha
        @Override
        public void speedUp() {
            System.out.println("Xe đạp tăng tốc bằng cách đạp pedal.");
        }
    }


