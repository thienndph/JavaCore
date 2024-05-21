package JavaAbstractClasses;

// Lớp trừu tượng JavaAbstractClasses.Customer
    abstract class Customer {
        protected String name;
        protected int customerId;

        public Customer(String name, int customerId) {
            this.name = name;
            this.customerId = customerId;
        }

        // Phương thức trừu tượng tính lương
        public abstract double calculateSalary();

        // Phương thức trừu tượng hiển thị thông tin khách hàng
        public abstract void displayInfo();
    }

    // Lớp con Quản lý mở rộng từ JavaAbstractClasses.Customer
    class QuanLy extends Customer {
        private double baseSalary;
        private double bonus;

        public QuanLy(String name, int customerId, double baseSalary, double bonus) {
            super(name, customerId);
            this.baseSalary = baseSalary;
            this.bonus = bonus;
        }

        @Override
        public double calculateSalary() {
            return baseSalary + bonus;
        }

        @Override
        public void displayInfo() {
            System.out.println("Tên Quản lý: " + name);
            System.out.println("Mã khách hàng: " + customerId);
            System.out.println("Lương cơ bản: $" + baseSalary);
            System.out.println("Thưởng: $" + bonus);
            System.out.println("Tổng lương: $" + calculateSalary());
        }
    }

    // Lớp con Lập trình viên mở rộng từ JavaAbstractClasses.Customer
    class LapTrinhVien extends Customer {
        private double salaryPerHour;
        private int hoursWorked;

        public LapTrinhVien(String name, int customerId, double salaryPerHour, int hoursWorked) {
            super(name, customerId);
            this.salaryPerHour = salaryPerHour;
            this.hoursWorked = hoursWorked;
        }

        @Override
        public double calculateSalary() {
            return salaryPerHour * hoursWorked;
        }

        @Override
        public void displayInfo() {
            System.out.println("Tên Lập trình viên: " + name);
            System.out.println("Mã khách hàng: " + customerId);
            System.out.println("Lương mỗi giờ: $" + salaryPerHour);
            System.out.println("Số giờ làm việc: " + hoursWorked);
            System.out.println("Tổng lương: $" + calculateSalary());
        }
    }

