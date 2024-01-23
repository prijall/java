public class BankInfo {
    public static void main(String[] args) {
        BankAccount normalAccount = new BankAccount();
        normalAccount.deposit(200);
        normalAccount.withdraw(150);
        System.out.println("Normal Account Balance: " + normalAccount.getBalance());

        SavingAccount savingAccount = new SavingAccount();
        savingAccount.deposit(200);
        savingAccount.withdraw(80);
        System.out.println("Saving Account Balance: " + savingAccount.getBalance());
        savingAccount.withdraw(30);
        System.out.println("Saving Account Balance: " + savingAccount.getBalance());
    }
}
