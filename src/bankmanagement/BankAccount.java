package bankmanagement;

public class BankAccount
{
    final Integer accountNumber;
    String holderName;
    double balance;

    BankAccount(Integer accountNumber, String holderName, double balance)
    {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    BankAccount(Integer accountNumber, String holderName)
    {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
    }

    BankAccount()
    {
        this.accountNumber = 3;
        this.holderName = "Ram";
        this.balance = 5000.0;
    }

    void deposit(double amount)
    {
        this.balance = this.balance + amount;
    }

    void withdrawal(double amount)
    {
        this.balance = this.balance - amount;
    }
}