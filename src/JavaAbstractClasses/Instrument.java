package JavaAbstractClasses;

abstract class Instrument {
    // Phương thức trừu tượng play
    public abstract void play();

    // Phương thức trừu tượng tune
    public abstract void tune();
}

// Lớp Glockenspiel mở rộng từ lớp Instrument
class Glockenspiel extends Instrument {
    @Override
    public void play() {
        System.out.println("Playing the Glockenspiel with mallets.");
    }

    @Override
    public void tune() {
        System.out.println("Tuning the Glockenspiel by adjusting the metal bars.");
    }
}

// Lớp Violin mở rộng từ lớp Instrument
class Violin extends Instrument {
    @Override
    public void play() {
        System.out.println("Playing the Violin with a bow.");
    }

    @Override
    public void tune() {
        System.out.println("Tuning the Violin by adjusting the pegs.");
    }
}
