package JavaInheritance;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("0. Exit");
            System.out.println("1. Bài 1");
            System.out.println("2. Bài 2");
            System.out.println("3. Bài 3");
            System.out.println("4. Bài 4");
            System.out.println("5. Bài 5");
            System.out.println("6. Bài 6");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:

                    Animal animal = new Animal();
                    animal.makeSound();

                    Cat cat = new Cat();
                    cat.makeSound();
                    break;
                case 2:
                    Vehicle myVehicle = new Vehicle();
                    myVehicle.drive();

                    Car myCar = new Car();
                    myCar.drive();
                    break;
                case 3:

                case 4:
                    Rectangle myRectangle = new Rectangle(5, 3);

                    System.out.println("Diện tích hình chữ nhật: " + myRectangle.getArea());
                case 5:
                    Employee employee = new Employee("John Doe", 3000.0);
                    employee.work();
                    System.out.println("Salary: " + employee.getSalary());

                    HRManager hrManager = new HRManager("Jane Smith", 5000.0);
                    hrManager.work();
                    System.out.println("Salary: " + hrManager.getSalary());
                    hrManager.addEmployee();
                    break;
                case 6:
                    BankAccount account = new BankAccount(500);
                    account.deposit(200);
                    account.withdraw(100);

                    SavingsAccount savingsAccount = new SavingsAccount(500);
                    savingsAccount.deposit(200);
                    savingsAccount.withdraw(100);
                    savingsAccount.withdraw(600);
                    break;
                case 7:
                    AnimalCheetah genericAnimal = new AnimalCheetah();
                    genericAnimal.move();

                    Cheetah cheetah = new Cheetah();
                    cheetah.move();
                case 8:
                    Person person = new Person("John", "Doe");
                    System.out.println("JavaInheritance.Person's first name: " + person.getFirstName());
                    System.out.println("JavaInheritance.Person's last name: " + person.getLastName());

                    Employe employe = new Employe("Jane", "Smith", "E123", "Manager");
                    System.out.println("JavaInheritance.Employee's first name: " + employe.getFirstName());
                    System.out.println("JavaInheritance.Employee's last name: " + employe.getLastName());
                    System.out.println("JavaInheritance.Employee's ID: " + employe.getEmployeeId());
                    break;

                case 10:
                    NhanVien quanLy = new QuanLy("Alice Smith", "123 Đường Chính", 120000);
                    NhanVien lapTrinhVien = new LapTrinhVien("Bob Johnson", "456 Đường Elm", 100000);
                    NhanVien lapTrinhVienKhac = new LậpTrìnhViên("Charlie Brown", "789 Đường Oak", 90000);

                    System.out.println(quanLy);
                    System.out.println("Thưởng: $" + quanLy.tinhThuong());
                    System.out.println(quanLy.taoBaoCaoHieuSuat());
                    quanLy.quanLyDuAn("Dự án Alpha");

                    System.out.println();

                    System.out.println(lapTrinhVien);
                    System.out.println("Thưởng: $" + lapTrinhVien.tinhThuong());
                    System.out.println(lapTrinhVien.taoBaoCaoHieuSuat());
                    lapTrinhVien.quanLyDuAn("Dự án Beta");

                    System.out.println();

                    System.out.println(lapTrinhVienKhac);
                    System.out.println("Thưởng: $" + lapTrinhVienKhac.tinhThuong());
                    System.out.println(lapTrinhVienKhac.taoBaoCaoHieuSuat());
                    lapTrinhVienKhac.quanLyDuAn("Dự án Gamma");
                    break;
                default:
                    System.out.println("Invalid choice. Please select again.");
            }
        }

        scanner.close();
    }
}