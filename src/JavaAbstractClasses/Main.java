package JavaAbstractClasses;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu:");
            System.out.println(" Bài 1");
            System.out.println(" Bài 2");
            System.out.println(" Bài 3");
            System.out.println(" Bài 4");
            System.out.println(" Bài 5");
            System.out.println(" Bài 6");
            System.out.println(" Bài 7");
            System.out.println(" Bài 8");
            System.out.println(" Bài 9");
            System.out.println(" Bài 10");
            System.out.println(" Bài 11");
            System.out.println(" Bài 12");
            System.out.print("Chọn một tùy chọn: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    Animal lion = new Lion("Simba");
                    Animal tiger = new Tiger("Shere Khan");

                    lion.sound();
                    tiger.sound();
                    break;
                case 2:
                    Shape circle = new Circle("Hình tròn", 5.0);
                    Shape triangle = new Triangle("Hình tam giác", 3.0, 4.0, 5.0);

                    System.out.println(circle);
                    System.out.println("Diện tích: " + circle.calculateArea());
                    System.out.println("Chu vi: " + circle.calculatePerimeter());

                    System.out.println();

                    System.out.println(triangle);
                    System.out.println("Diện tích: " + triangle.calculateArea());
                    System.out.println("Chu vi: " + triangle.calculatePerimeter());
                    break;
                case 3:

                    BankAccount savingsAccount = new SavingsAccount(1000);
                    System.out.println("Số dư ban đầu trong tài khoản tiết kiệm: $" + savingsAccount.getBalance());
                    savingsAccount.deposit(500);
                    System.out.println("Số dư hiện tại trong tài khoản tiết kiệm: $" + savingsAccount.getBalance());
                    savingsAccount.withdraw(200);
                    System.out.println("Số dư cuối cùng trong tài khoản tiết kiệm: $" + savingsAccount.getBalance());

                    System.out.println();


                    BankAccount currentAccount = new CurrentAccount(2000);
                    System.out.println("Số dư ban đầu trong tài khoản vãng lai: $" + currentAccount.getBalance());
                    currentAccount.deposit(1000);
                    System.out.println("Số dư hiện tại trong tài khoản vãng lai: $" + currentAccount.getBalance());
                    currentAccount.withdraw(2500);
                    System.out.println("Số dư cuối cùng trong tài khoản vãng lai: $" + currentAccount.getBalance());
                    break;
                case 4:
                    DongVat suTu = new SuTu("Su tu");
                    DongVat ho = new Ho("JavaAbstractClasses.Ho");
                    DongVat nai = new Nai("JavaAbstractClasses.Nai");

                    System.out.println("Hanh vi an va ngu cua cac loai dong vat:");

                    System.out.println("------ Su tu ------");
                    suTu.an();
                    suTu.ngu();

                    System.out.println("------ JavaAbstractClasses.Ho ------");
                    ho.an();
                    ho.ngu();

                    System.out.println("------ JavaAbstractClasses.Nai ------");
                    nai.an();
                    nai.ngu();
                    break;
                default:
                case 5:

                    Customer quanLy = new QuanLy("John Doe", 101, 5000, 1000);
                    quanLy.displayInfo();

                    System.out.println();


                    Customer lapTrinhVien = new LapTrinhVien("Alice Smith", 102, 50, 40);
                    lapTrinhVien.displayInfo();
                    break;
                case 6:

                    Vehicle myCar = new Car();
                    myCar.startEngine();
                    myCar.stopEngine();


                    Vehicle myMotorcycle = new Motorcycle();
                    myMotorcycle.startEngine();
                    myMotorcycle.stopEngine();
                    break;
                case 7:
                    Person athlete = new Athlete();
                    athlete.eat();
                    athlete.practice();


                    Person lazyPerson = new LazyPerson();
                    lazyPerson.eat();
                    lazyPerson.practice();
                    break;
                case 8:

                    Employee manager = new Manager("Alice", 101, 5000, 2000);
                    manager.displayInfo();

                    System.out.println(); // Dòng trống để phân cách


                    Employee programmer = new Programmer("Bob", 102, 4000, 50, 20);
                    programmer.displayInfo();
                    break;
                case 9:

                    Instrument glockenspiel = new Glockenspiel();
                    glockenspiel.play();
                    glockenspiel.tune();


                    Instrument violin = new Violin();
                    violin.play();
                    violin.tune();
                    break;
                case 10:
                    // Tạo một hình chữ nhật và vẽ nó
                    Rectangle rectangle = new Rectangle(5, 3);
                    rectangle.draw();


                    rectangle.resize(1.5);


                    Circle2 circle2 = new Circle2(4);
                    circle2.draw();


                    circle2.resize(2);
                    break;
                case 11:

                        Bird eagle = new Eagle();
                        eagle.fly();
                        eagle.makeSound();


                        Bird hawk = new Hawk();
                        hawk.fly();
                        hawk.makeSound();
                        break;
                case 12:

                    GeometricShape triangle2 = new Triangle2(3, 4, 5);
                    System.out.println("Diện tích của tam giác: " + triangle2.area());
                    System.out.println("Chu vi của tam giác: " + triangle2.perimeter());


                    GeometricShape square = new Square(4);
                    System.out.println("Diện tích của hình vuông: " + square.area());
                    System.out.println("Chu vi của hình vuông: " + square.perimeter());
            }

            System.out.println();
        }
        scanner.close();
    }
}