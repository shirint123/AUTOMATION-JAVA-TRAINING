//14. BankAccount class

  // * Fields: 'accountNumber', 'balance'.
   //* Methods: 'deposit()', 'withdraw()'.
   //* Demonstrate deposit and withdraw with an object.


package com.aw.automationtraining;

public class bankAccount 
{
    String accountNumber;
    double balance;

    public void deposit(double amount)
    {
        if (amount > 0) {
            balance = balance +amount;
            System.out.println("Deposited " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawl" + amount + ". New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }


    public static void main(String[] args) 
    {
        bankAccount b = new bankAccount();
        b.accountNumber = "9258956201";
        b.balance = 1000.00;

        System.out.println("Account Number: " + b.accountNumber);
        System.out.println("Initial Balance: " + b.balance);

        b.deposit(1500);
        b.withdraw(500.00);

    }
}
