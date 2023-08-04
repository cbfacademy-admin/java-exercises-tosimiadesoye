package com.cbfacademy.accounts;

public class SavingAccount extends Account {
    double interest;

    public SavingAccount(long accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interest = interest;

    }

    @Override
    public void deposit(double balance, double interest) {

        this.interest = interest;
        balance += balance * interest;

        System.out.println("balance after interest is: " + balance);
    }

    public void applyInterest() {

        this.interest = interest;
        balance += balance * interest;

        System.out.println("balance after interest is: " + balance);
    }

}
