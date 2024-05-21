package JavaInheritance;

class Employee {
        protected String name;
        protected double salary;

        // Constructor để khởi tạo tên và lương
        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        // Phương thức work của lớp JavaInheritance.Employee
        public void work() {
            System.out.println(name + " is working.");
        }

        // Phương thức getSalary của lớp JavaInheritance.Employee
        public double getSalary() {
            return salary;
        }
    }

    // Lớp JavaInheritance.HRManager kế thừa từ JavaInheritance.Employee
    class HRManager extends Employee {

        // Constructor để khởi tạo tên và lương cho JavaInheritance.HRManager
        public HRManager(String name, double salary) {
            super(name, salary);
        }

        // Ghi đè phương thức work của lớp JavaInheritance.Employee
        @Override
        public void work() {
            System.out.println(name + " is managing human resources.");
        }

        // Phương thức mới addEmployee của lớp JavaInheritance.HRManager
        public void addEmployee() {
            System.out.println(name + " is adding a new employee.");
        }
}
