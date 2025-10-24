package bankmanagement;

public class SavingsAccount extends BankAccount
{
    private double interestRate;
    SavingsAccount(Integer accountNumber, String holderName, double balance, double interestRate)
    {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate()
    {
        return interestRate;
    }

    @Override
    public void withdrawal(double amount)
    {
        if(getBalance() - amount < 500)
        {
            System.out.println("Minimum balance of 500 required");
        }
        else
        {
            super.withdrawal(amount);
        }
    }

}
