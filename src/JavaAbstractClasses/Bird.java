package JavaAbstractClasses;

abstract class Bird {
    // Phương thức trừu tượng fly
    public abstract void fly();

    // Phương thức trừu tượng makeSound
    public abstract void makeSound();
}

// Lớp Eagle mở rộng từ lớp Bird
class Eagle extends Bird {
    @Override
    public void fly() {
        System.out.println("Eagle is flying high in the sky.");
    }

    @Override
    public void makeSound() {
        System.out.println("Eagle makes a screeching sound.");
    }
}

// Lớp Hawk mở rộng từ lớp Bird
class Hawk extends Bird {
    @Override
    public void fly() {
        System.out.println("Hawk is flying gracefully.");
    }

    @Override
    public void makeSound() {
        System.out.println("Hawk makes a sharp cry.");
    }
}

