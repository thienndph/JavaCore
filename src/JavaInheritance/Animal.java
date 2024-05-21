package JavaInheritance;

// Định nghĩa lớp JavaInheritance.Animal
class Animal {
    // Phương thức makeSound() của lớp JavaInheritance.Animal
    public void makeSound() {
        System.out.println("Sự im lặng của động vật.");
    }
}

// Định nghĩa lớp con JavaInheritance.Cat kế thừa từ lớp JavaInheritance.Animal
class Cat extends Animal {
    // Ghi đè phương thức makeSound() của lớp JavaInheritance.Animal
    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }
}

