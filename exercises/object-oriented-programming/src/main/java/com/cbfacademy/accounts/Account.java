package com.cbfacademy.accounts;

public class Account {
    protected double balance = 500;
    private long accountNumber;
    protected double deposit;
    protected double withdraw;

    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getDeposit() {
        return deposit;
    }

    public double deposit(double dividend) {
        return dividend;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }

    public void deposit(double balance, double deposit) {
        this.deposit = deposit;
        this.balance = balance + deposit;
        System.out.println("deposit: " + deposit);

    }

    public void withdraw(double balance, double withdraw) {

        if (withdraw <= balance && !(withdraw < 0)) {
            this.withdraw = withdraw;
            this.balance = balance - withdraw;
            System.out.println("balance: " + balance);
        } else {
            System.out.println("you have insufficient fund");
        }

    }
}
