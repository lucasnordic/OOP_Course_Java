package E04_IntroductionOOP;

import java.util.ArrayList;
import java.util.Scanner;

public class LevelOne2 {
    public static BankAccounts bankAccounts = new BankAccounts();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        bankAccounts.createUserAccount("Billy", 2000);
        bankAccounts.createUserAccount("Linda", 400);
        bankAccounts.createUserAccount("Charmander", 24400);
        bankAccounts.createUserAccount("Sven", 50240);

        mainMenu();
    }

    public static void mainMenu() {
        System.out.println("Welcome to Lukii bank account manager!\n");
        bankAccounts.printAccounts();

        //  Here we store the max and min choice of the "menuItems":
        int minMenuChoice = 1;
//        int maxMenuChoice = bankAccounts.;
        int menuChoice;


        System.out.print("Which account would you like to edit(Choose number in menu): ");
//        int menuChoice = 0;
//        switch (menuChoice) {
//            case 1 -> bankAccounts(1)
//            case 2 -> BankAccount.withdraw();
//            case 3 ->
//        }

//        System.out.print("Would you like to (D)eposit or (W)ithdraw?: ");
//        String menuStringChoice = sc.nextLine();
//        int menuIntChoice;
//        while (menuStringChoice = 0 || menuStringChoice = 1)
//        if (menuStringChoice.equalsIgnoreCase("D")) {
//            menuIntChoice = 0;
//        } else if (menuStringChoice.equalsIgnoreCase("W")) {
//            menuIntChoice = 1;
//        }

//        switch (menuChoice.toUpperCase()) {
//            case "D" -> BankAccount.deposit();
//            case "W" -> BankAccount.withdraw();
//        }
    }

}

class BankAccounts {
    private ArrayList<BankAccount> accountList = new ArrayList<>();

    public BankAccount createUserAccount(String accountName, double accountBalance) {
        BankAccount ba = new BankAccount(accountName, accountBalance);
        return addUserAccount(ba);
    }

    public BankAccount addUserAccount(BankAccount newAccount) {
        accountList.add(newAccount);
//        System.out.println(" Employee was successfully added");
//        System.out.println(" ");
        return newAccount;
    }

//    public ArrayList<BankAccount> getAccountList() {
//        return accountList;
//    }

    public void printAccounts() {
        System.out.println("Here is a list of bank accounts: ");
        for (int i = 0; i < accountList.size() ; i++) {
            System.out.println((i + 1) + ". " +  accountList.get(i));
        }
        System.out.println("");
    }
}

class BankAccount {
    private String accountName;
    private double accountBalance;

    BankAccount(String accountName, double accountBalance) {
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

//    public boolean equals(Object otherObject) {
//
//
//    }

}



/*
You are writing code for a bank.
Create a class to represent a bank account.

Each account has the name of the account owner and a balance.
A user should be able to check the owner’s name and the account balance.
In addition, the user can deposit and withdraw money.
Then, create a main class with the following procedure:

Create 3 accounts: (Eve, 1000.39); (John, 500000.00); (Mary, 12540000.99)
Withdraw 500 from each account.
Print each  account balance  (Eve, 500.39); (John, 499500.00); (Mary, 12539500.99)
Deposit 1500 in each account
Print each account balance  (Eve, 2000.39); (John, 501000.00); (Mary, 12541000.99)

 */