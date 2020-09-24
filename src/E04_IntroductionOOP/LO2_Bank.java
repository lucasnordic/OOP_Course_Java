package E04_IntroductionOOP;

import java.util.ArrayList;

public class LO2_Bank {
    private ArrayList<LO2_BankAccount> accountList = new ArrayList<>();

    public LO2_BankAccount createUserAccount(String accountName, double accountBalance) {
        LO2_BankAccount ba = new LO2_BankAccount(accountName, accountBalance);
        return addUserAccount(ba);
    }

    public LO2_BankAccount addUserAccount(LO2_BankAccount newAccount) {
        accountList.add(newAccount);
//        System.out.println(" Employee was successfully added");
//        System.out.println(" ");
        return newAccount;
    }

    public ArrayList<LO2_BankAccount> getAccountList() {
        return accountList;
    }

    public String getAccountListText() {
        String menuText = "Here is a list of bank accounts: \n";
        for (int i = 0; i < accountList.size() ; i++) {
            menuText += (i + 1) + ". " +  accountList.get(i) + "\n";
        }
        return menuText;
    }

}