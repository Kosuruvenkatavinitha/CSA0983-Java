import java.util.*;
public class Account {
    private double balance;

    // Constructor to set the initial balance
    public Account(double initialBalance) {
        balance = initialBalance;
    }

    // Constructor with no arguments (sets initial balance to $0)
    public Account() {
        balance = 0;
    }    

    // Function to add money to the account
    public void addMoney(double amount) {
        balance += amount;
    }

    // Function to withdraw money from the account
    public void withdrawMoney(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds. A $5 penalty will be charged.");
            balance -= 5;
        }
    }

    // Function to inquire the current balance
    public double getBalance() {
        return balance;
    }

    // Function to compute interest on the current balance
    public void computeInterest(double interestRate) {
        double interest = balance * interestRate / 100;
        balance += interest;
    }

    public static void main(String[] args) {
        // Create an account with initial balance of $1000
        Account account = new Account(1000);
        System.out.println("Initial Balance: $" + account.getBalance());

        // Add $500 to the account
        account.addMoney(500);
        System.out.println("Balance after adding $500: $" + account.getBalance());

        // Withdraw $200 from the account
        account.withdrawMoney(200);
        System.out.println("Balance after withdrawing $200: $" + account.getBalance());

        // Withdraw $1500 from the account (insufficient funds)
        account.withdrawMoney(1500);
        System.out.println("Balance after attempting to withdraw $1500: $" + account.getBalance());

        // Compute interest at a rate of 5%
        account.computeInterest(5);
        System.out.println("Balance after computing interest: $" + account.getBalance());
    }
}
