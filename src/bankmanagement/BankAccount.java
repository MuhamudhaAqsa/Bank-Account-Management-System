package bankmanagement;

public class BankAccount
{

    private final Integer accountNumber;
    private String holderName;
    private double balance;
    public static final String bankName;
    private static int totalAccounts;

    static
    {
        bankName = "Trusted Bank";
    }

    public Integer getAccountNumber()
    {
        return accountNumber;
    }

    public String getHolderName()
    {
        return holderName;
    }

    public double getBalance()
    {
        return balance;
    }

    static int getTotalAccounts()
    {
        return BankAccount.totalAccounts;
    }


    BankAccount(Integer accountNumber, String holderName, double balance)
    {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
        BankAccount.totalAccounts = BankAccount.totalAccounts + 1;
    }

    BankAccount(Integer accountNumber, String holderName)
    {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        BankAccount.totalAccounts = BankAccount.totalAccounts + 1;
    }

    BankAccount()
    {
        this.holderName = "Ram";
        this.balance = 5000.0;
        BankAccount.totalAccounts = BankAccount.totalAccounts + 1;
        this.accountNumber = BankAccount.totalAccounts;
    }

    public void deposit(double amount)
    {
        this.balance = this.balance + amount;
        Transaction transaction = new Transaction("Deposit", amount, this.holderName, this.balance);
        transaction.logTransaction();
    }

    public void withdrawal(double amount)
    {
        this.balance = this.balance - amount;
        Transaction transaction = new Transaction("Withdraw", amount, this.holderName, this.balance);
        transaction.logTransaction();
    }

    static class Transaction
    {
        private final String type;
        private final double amount;
        private final String holderName;
        private final double balance;
        Transaction(String type, double amount, String holderName, double balance)
        {
            this.type = type;
            this.amount = amount;
            this.holderName = holderName;
            this.balance = balance;
        }
        public final void logTransaction()
        {
            System.out.println(this.type + " " + "of" + " " + this.amount + " " + "for" + " " + this.holderName +
                    " " + "|" + " " + "Updated Balance:" + " " + this.balance);
        }
    }



}