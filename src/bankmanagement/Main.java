package bankmanagement;

import static bankmanagement.BankAccount.getTotalAccounts;

public class Main
{
    public static void main(String[] args)
    {

        Bank bank = Bank.getInstance();

        BankAccount fathima = new BankAccount(1, "Fathima", 1000.0);

        BankAccount alice = new BankAccount(2, "Alice");

        BankAccount ram = new BankAccount();

       System.out.println(fathima.getAccountNumber());
       System.out.println(fathima.getHolderName());
       System.out.println(fathima.getBalance());

        System.out.println(getTotalAccounts());

        fathima.withdrawal(500.0);

        SavingsAccount savingsAcc = new SavingsAccount(4, "Radha",
                8000, 4);

        CurrentAccount currAcc = new CurrentAccount(5, "Latha",
                6000, 2000);

        BankAccount acc1 = new SavingsAccount(6, "Henry", 3000, 4);

        acc1.withdrawal(3000);

        BankAccount acc2 = new CurrentAccount(7, "John", 7000, 10000);

        acc2.withdrawal(42000);

        FixedDepositAccount ahamed = new FixedDepositAccount();

    }
}
