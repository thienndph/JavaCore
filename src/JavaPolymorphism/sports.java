package JavaPolymorphism;

class Sports {
    // Method play() (default implementation)
    public void play() {
        System.out.println("Playing a sport");
    }
}

// Subclass Football extending Sports
class Football extends Sports {
    // Override method play() for Football
    @Override
    public void play() {
        System.out.println("Playing football");
    }
}

// Subclass Basketball extending Sports
class Basketball extends Sports {
    // Override method play() for Basketball
    @Override
    public void play() {
        System.out.println("Playing basketball");
    }
}

// Subclass Rugby extending Sports
class Rugby extends Sports {
    // Override method play() for Rugby
    @Override
    public void play() {
        System.out.println("Playing rugby");
    }
}