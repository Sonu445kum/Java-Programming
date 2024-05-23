package Abstracts;
import java.util.Scanner;
abstract class BanksAccount{
    private String accountNumber;
    private double balance;

    public BanksAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);
}
    class SavingsAccounts extends BanksAccount{
    public SavingsAccounts(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposit of $" + amount + " successful. Current balance: $" + getBalance());
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal of $" + amount + " successful. Current balance: $" + getBalance());
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }
}
    class CurrentAccount extends BanksAccount{
    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposit of $" + amount + " successful. Current balance: $" + getBalance());
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal of $" + amount + " successful. Current balance: $" + getBalance());
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }

}
public class testAbstractEx {
    public static void main(String[] args) {
//        double a,b,c;
//        a = 1000.00;
//        SavingsAccounts savingsAccount = new SavingsAccounts("SA001", a);
//        System.out.println("Savings A/c: Initial Balace: $"+a);
//        b = 500.00;
//        savingsAccount.deposit(b);
//        c = 250.00;
//        savingsAccount.withdraw(c);
//        c = 1600.00;
//        System.out.println("\nTry to withdraw: $"+b);
//        savingsAccount.withdraw(c);
//
//        System.out.println();
//        a = 5000.00;
//        CurrentAccount currentAccount = new CurrentAccount("CA001", a);
//        System.out.println("Current A/c: Initial Balace: $"+a);
//        b= 2500.00;
//        currentAccount.deposit(1000.0);
//        c = 1250.00;
//        currentAccount.withdraw(3000.0);
//        c= 6000.00;
//        System.out.println("\nTry to withdraw: $"+c);
//        savingsAccount.withdraw(c);
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter First value");
//        double a=sc.nextInt();
//        System.out.println("Enter the Second Value:");
//        double b=sc.nextInt();
//        System.out.println("Enter the Third Value:");
//        double c=sc.nextInt();
//        SavingsAccounts sa=new SavingsAccounts(a);



    }
}
