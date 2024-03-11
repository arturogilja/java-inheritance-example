package BankAccounts;

public class Transaction {
    private final double amount;
    Transaction(double amount){
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
