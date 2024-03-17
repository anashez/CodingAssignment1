public class PremiumAccount implements IAccount{
    private int accountNumber;
    private double balance;
    public PremiumAccount(int accountNumber){
        this.accountNumber = accountNumber;
    }

    @Override
    public void Deposit(double amount) {
        this.balance+=amount;
    }

    @Override
    public double Withdraw(double amount) {
        this.balance-=amount;
        return amount;
    }

    @Override
    public double GetCurrentBalance() {
        return this.balance;
    }

    @Override
    public int GetAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}