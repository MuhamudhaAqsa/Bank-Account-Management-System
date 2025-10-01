package bankmanagement;

public class Main
{
    public static void main(String[] args)
    {
        BankAccount fathima = new BankAccount(1, "Fathima", 1000.0);

        BankAccount alice = new BankAccount(2, "Alice");

        BankAccount ram = new BankAccount();

       System.out.println(fathima.accountNumber);
       System.out.println(fathima.holderName);
       System.out.println(fathima.balance);

        System.out.println(alice.accountNumber);
        System.out.println(alice.holderName);
        System.out.println(alice.balance);

        System.out.println(ram.accountNumber);
        System.out.println(ram.holderName);
        System.out.println(ram.balance);

        alice.deposit(3000.0);

        System.out.println(alice.balance);

        ram.withdrawal(1000.0);

        System.out.println(ram.balance);

    }
}
