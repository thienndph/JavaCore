package JavaAbstractClasses;

abstract class Person {
        // Phương thức trừu tượng
        abstract void eat();
        abstract void practice();
    }

    // Lớp JavaAbstractClasses.Athlete kế thừa từ JavaAbstractClasses.Person
    class Athlete extends Person {
        // Triển khai phương thức eat cho JavaAbstractClasses.Athlete
        @Override
        void eat() {
            System.out.println("JavaAbstractClasses.Athlete is eating a balanced diet rich in proteins and vitamins.");
        }

        // Triển khai phương thức practice cho JavaAbstractClasses.Athlete
        @Override
        void practice() {
            System.out.println("JavaAbstractClasses.Athlete is practicing for 4 hours a day.");
        }
    }

    // Lớp JavaAbstractClasses.LazyPerson kế thừa từ JavaAbstractClasses.Person
    class LazyPerson extends Person {
        // Triển khai phương thức eat cho JavaAbstractClasses.LazyPerson
        @Override
        void eat() {
            System.out.println("JavaAbstractClasses.LazyPerson is eating junk food and snacks.");
        }

        // Triển khai phương thức practice cho JavaAbstractClasses.LazyPerson
        @Override
        void practice() {
            System.out.println("JavaAbstractClasses.LazyPerson is lying on the couch watching TV.");
        }
    }


