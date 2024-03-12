import BankAccounts.BankAccount;
import BankAccounts.SavingsAccount;
import Entities.Person;
import Entities.Student;

public class Main {
    public static void main(String... args) {
//        Person person1 = new Person("Arturo", "Gil");
//        Person person2 = new Person("Arturo", "Gil");
//        Student student1 = new Student("Roberto", "Garcia", "327816");
//
//        System.out.println(person1);
//        System.out.println(person2);
//        System.out.println(student1);
//        System.out.println("EQUAL: " + person1.equals(person2));
//
//        SavingsAccount.modifyAnnualInterestRate(0.12);
//        SavingsAccount acc1 = new SavingsAccount(0);
//        acc1.deposit(100);
//        acc1.deposit(50);
//        acc1.withdraw(100);
//        acc1.calculateMonthlyInterest();
//        acc1.deposit(1000);
//        acc1.withdraw(500);
//        acc1.calculateMonthlyInterest();

//        BankAccount account1 = new BankAccount(2000);
//        BankAccount account2 = new BankAccount(0);
//
//        account1.transferToAccount(500, account2);


//        System.out.println("1: "+ account1.checkCurrentBalance());
//        System.out.println("2: "+ account2.checkCurrentBalance());

        BankAccount account1 = new SavingsAccount(500);
        BankAccount account2 = new SavingsAccount(0);

        account1.transferToAccount(400, account2);

        System.out.println("1: "+ account1.checkCurrentBalance());
        System.out.println("2: "+ account2.checkCurrentBalance());
    }
}