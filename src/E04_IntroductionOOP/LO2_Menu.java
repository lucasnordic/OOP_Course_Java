package E04_IntroductionOOP;

import java.util.ArrayList;
import java.util.Scanner;

public class LO2_Menu {
    private static Scanner sc = new Scanner(System.in);
    private LO2_Bank bank = new LO2_Bank();

    public LO2_Menu() {
        bank.createUserAccount("Billy", 2000);
        bank.createUserAccount("Linda", 400);
        bank.createUserAccount("Charmander", 24400);
        bank.createUserAccount("Sven", 50240);
    }

    public void mainMenu() {
        System.out.println("Welcome to my bank account manager!\n");
        System.out.println(bank.getAccountListText());

        System.out.print("Which account would you like to edit(Choose number in menu): ");
        LO2_BankAccount accountTest = selectAccount();
        System.out.println("Selected bank account is " + accountTest);
        System.out.println("-----------------------------------------");

        System.out.print("Would you like to (D)eposit or (W)ithdraw?: ");
        String menuChoice = sc.nextLine();;
        switch (menuChoice.toUpperCase()) {
            case "D" -> depositMenu(accountTest);
            case "W" -> withdrawMenu(accountTest);
        }

    }

    public void depositMenu(LO2_BankAccount account) {
        System.out.print("How much would you like to deposit: ");
    }

    public void withdrawMenu(LO2_BankAccount account) {
        //selectAccount
        //How much
        //check balance
        // LO2_ba.withdraw(how much)
    }

    public LO2_BankAccount selectAccount() {
        ArrayList<LO2_BankAccount> accountList = bank.getAccountList();
        int minMenuChoice = 1;
        int maxMenuChoice = accountList.size() + 1;

        int accountIndex = inputIntMinMax(minMenuChoice, maxMenuChoice);
        LO2_BankAccount account = accountList.get(accountIndex);
        return account;
    }

    public int inputIntMinMax(int min, int max) {
        int inputResult = sc.nextInt();
        sc.nextLine();

        while (inputResult < min || inputResult > max) {
            System.out.print("Please enter a valid number: ");
            inputResult = sc.nextInt();
            sc.nextLine();
        }
        System.out.println(" ");

        return inputResult;
    }
}