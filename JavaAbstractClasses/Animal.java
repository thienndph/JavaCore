package JavaAbstractClasses;

abstract class Animal {
        protected String name;

        public Animal(String name) {
            this.name = name;
        }

        // Phương thức trừu tượng sound()
        public abstract void sound();
    }

    // Lớp JavaAbstractClasses.Lion mở rộng từ JavaAbstractClasses.Animal
    class Lion extends Animal {

        public Lion(String name) {
            super(name);
        }

        @Override
        public void sound() {
            System.out.println(name + " rống: Roar!");
        }
    }

    // Lớp JavaAbstractClasses.Tiger mở rộng từ JavaAbstractClasses.Animal
    class Tiger extends Animal {

        public Tiger(String name) {
            super(name);
        }

        @Override
        public void sound() {
            System.out.println(name + " gầm: Grrr!");
        }
    }

