package org.example;

//define a class named BankAccount
public class BankAccount {
    //declare private variables for balance and account holder
    private double balance;
    private String accountHolderName;

    // Constructor for BankAccount class that initializes balance and accountHolderName
    public BankAccount(double balance, String accountHolderName) {
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }
    //public method to deposit an amount into the account
    public void deposit (double amount) {
        this.balance += amount; //add amount to the current balance.

    }

    //public method to withdraw an amount from the account
    public void withdraw (double amount) {
        this.balance -= amount; //subtract the amount from the current balance.
    }

    //public method to print the account details to the console
    public void printAccountDetails() {
        System.out.println(this.accountHolderName +"'s"+ " balance: " + this.balance);
    }

    //main method to test the BankAccount class
    public static void main(String[] args) {
        //First Part
        //create instance of BankAccount with initial balance of 500
        BankAccount myAccount = new BankAccount(500, "My Account");
        //deposit 100 into account
        myAccount.deposit(100);
        //print the account details to the console
        myAccount.printAccountDetails();

        //Second Part
        //create two additional instances of BankAccount
        BankAccount brittsAccount = new BankAccount(5000, "Britt");
        BankAccount debbiesAccount = new BankAccount(300, "Debbie");
        //withdraw 100
        brittsAccount.withdraw(100);
        //deposit 100
        debbiesAccount.deposit(100);

        brittsAccount.printAccountDetails();
        debbiesAccount.printAccountDetails();

    }

}
