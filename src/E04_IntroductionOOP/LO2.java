package E04_IntroductionOOP;

import java.util.ArrayList;
import java.util.Scanner;

public class LO2 {

    public static void main(String[] args) {

        LO2_Menu menu = new LO2_Menu();
        menu.mainMenu();

    }


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