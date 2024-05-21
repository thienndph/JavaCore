package LamDa;

public class Student {
        private String name;
        private int age;
        private String sClass;

        public Student(String name, int age, String sClass) {
            this.name = name;
            this.age = age;
            this.sClass = sClass;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getSClass() {
            return sClass;
        }

}
