package BankAccounts;

public class SavingsAccount extends BankAccount {
    private static double annualInterestRate;

    public SavingsAccount(double balance) {
        super(balance);
    }

    public static void modifyAnnualInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }

    public void calculateMonthlyInterest(){
        double monthlyInterestRate = annualInterestRate / 12;
        double interest = monthlyInterestRate * this.checkCurrentBalance();
        this.deposit(interest);
    }

    @Override
    public void transferToAccount(double amount, BankAccount account) {
        if(this.checkCurrentBalance() < 1000) {
            System.out.println("ERROR");
            return;
        }
        super.transferToAccount(amount, account);
    }
}
