package E04_IntroductionOOP;

public class LO2_BankAccount {
    private String accountName;
    private double accountBalance;

    LO2_BankAccount(String accountName, double accountBalance) {
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }

    public void withdraw(double amount) {
        accountBalance = accountBalance - amount;
    }

    public void deposit(double amount) {
        accountBalance = accountBalance + amount;
    }

    public String toString() {
        return accountName + " " + accountBalance;
    }
}