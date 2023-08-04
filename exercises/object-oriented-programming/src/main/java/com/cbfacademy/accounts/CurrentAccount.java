package com.cbfacademy.accounts;

public class CurrentAccount extends Account {

    double overdraftLimit;
    double withdraw;

    public CurrentAccount(long accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double balance, double withdraw) {

        if (withdraw <= (balance + overdraftLimit) && !(withdraw < 0)) {

            this.withdraw = withdraw;
            this.balance = balance - withdraw;
            System.out.println("balance: " + balance);
        } else {
            System.out.println("you have insufficient fund");
        }
    }

}
