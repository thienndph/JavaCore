package JavaInheritance;

class AnimalCheetah {
    // Phương thức move của lớp JavaInheritance.Animal
    public void move() {
        System.out.println("The animal moves");
    }
}

// Lớp JavaInheritance.Cheetah kế thừa từ JavaInheritance.Animal
class Cheetah extends AnimalCheetah {
    // Ghi đè phương thức move để thể hiện hành động chạy
    @Override
    public void move() {
        System.out.println("The cheetah runs swiftly");
    }
}