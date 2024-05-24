package JavaAbstractClasses;

// Lớp trừu tượng JavaAbstractClasses.BankAccount
abstract class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Phương thức trừu tượng gửi tiền
    public abstract void deposit(double amount);

    // Phương thức trừu tượng rút tiền
    public abstract void withdraw(double amount);

    // Phương thức để hiển thị số dư
    public double getBalance() {
        return balance;
    }
}

// Lớp con JavaAbstractClasses.SavingsAccount mở rộng từ JavaAbstractClasses.BankAccount
class SavingsAccount extends BankAccount {

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Đã gửi vào tài khoản tiết kiệm: $" + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Đã rút từ tài khoản tiết kiệm: $" + amount);
        } else {
            System.out.println("Số dư không đủ để thực hiện giao dịch!");
        }
    }
}

// Lớp con JavaAbstractClasses.CurrentAccount mở rộng từ JavaAbstractClasses.BankAccount
class CurrentAccount extends BankAccount {

    public CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Đã gửi vào tài khoản vãng lai: $" + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Đã rút từ tài khoản vãng lai: $" + amount);
        } else {
            System.out.println("Số dư không đủ để thực hiện giao dịch!");
        }
    }
}
