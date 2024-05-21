package JavaPolymorphism;

class Animal {
    // Method move() (default implementation)
    public void move() {
        System.out.println("Animal is moving");
    }

    // Method makeSound() (default implementation)
    public void makeSound() {
        System.out.println("Animal is making a sound");
    }
}

// Subclass Bird extending Animal
class Bird extends Animal {
    // Override method move() for Bird
    @Override
    public void move() {
        System.out.println("Bird is flying");
    }

    // Override method makeSound() for Bird
    @Override
    public void makeSound() {
        System.out.println("Bird is chirping");
    }
}

// Subclass Panthera extending Animal
class Panthera extends Animal {
    // Override method move() for Panthera
    @Override
    public void move() {
        System.out.println("Panthera is running");
    }

    // Override method makeSound() for Panthera
    @Override
    public void makeSound() {
        System.out.println("Panthera is roaring");
    }
}