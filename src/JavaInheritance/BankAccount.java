package JavaInheritance;

class BankAccount {
    protected double balance;

    // Constructor để khởi tạo số dư ban đầu
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Phương thức deposit để nạp tiền vào tài khoản
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Phương thức withdraw để rút tiền từ tài khoản
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    // Phương thức để lấy số dư tài khoản hiện tại
    public double getBalance() {
        return balance;
    }
}

// Lớp JavaInheritance.SavingsAccount kế thừa từ JavaInheritance.BankAccount
class SavingsAccount extends BankAccount {

    // Constructor để khởi tạo số dư ban đầu
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    // Ghi đè phương thức withdraw để ngăn chặn rút tiền nếu số dư dưới 100
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= 100) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("Cannot withdraw. Minimum balance of 100 must be maintained.");
        }
    }
}
