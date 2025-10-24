package bankmanagement;

public class CurrentAccount extends BankAccount
{
    private double overdraftLimit;
    CurrentAccount(Integer accountNumber, String holderName, double balance, double overdraftLimit)
    {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit()
    {
        return overdraftLimit;
    }

    @Override
    public void withdrawal(double amount)
    {
         if(getBalance() - amount >= -overdraftLimit)
         {
             super.withdrawal(amount);
         }
         else
         {
             System.out.println("Overdraft limit is " + overdraftLimit);
         }
    }
}
