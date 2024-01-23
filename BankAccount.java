class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingAccount extends BankAccount {
    @Override
    public void withdraw(double amount) {
        if (getBalance() >= 100 && amount > 0 && getBalance() - amount >= 100) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal not allowed: Insufficient funds or below minimum balance");
        }
    }
}

