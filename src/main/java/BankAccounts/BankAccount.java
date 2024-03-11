package BankAccounts;

import java.util.ArrayList;

public class BankAccount {
    private double initialBalance;
    protected final ArrayList<Transaction> transactions;
    protected final ArrayList<Transaction> oldTransactions;

    public BankAccount(double balance) {
        this.initialBalance = balance;
        this.transactions = new ArrayList<>();
        this.oldTransactions = new ArrayList<>();
    }

    public double checkCurrentBalance() {
        double totalAmount = 0;
        for(Transaction transaction : transactions) {
            totalAmount += transaction.getAmount();
        }
        return this.initialBalance + totalAmount;
    }

    public void deposit(double amount) {
        if(amount <= 0) {
            System.out.println("Not valid amount");
            return;
        }
        Transaction transaction = new Transaction(amount);
        transactions.add(transaction);
        this.printOperation("Deposit", amount);
    }

    public void withdraw(double amount) {
        if(this.checkCurrentBalance() < amount || amount < 0) {
            System.out.println("ERROR");
            return;
        }
        Transaction transaction = new Transaction(0 - amount);
        transactions.add(transaction);
        this.printOperation("Withdraw", amount);
    }

    public void endPeriod () {
        this.initialBalance = this.checkCurrentBalance();
        this.oldTransactions.addAll(transactions);
        transactions.clear();
        System.out.println("New Initial Balance: " + this.initialBalance);
    }

    private void printOperation(String operation, double amount) {
        String balanceString = String.format("%.2f", this.checkCurrentBalance());
        System.out.println(operation + " $" + amount + " ---- New balance: $" + balanceString);
    }
}
