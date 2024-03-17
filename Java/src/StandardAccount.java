public class StandardAccount implements IAccount{
    private int accountNumber;
    private double creditLimit;
    private double balance;
    public StandardAccount(int accountNumber, double creditLimit){
        this.accountNumber = accountNumber;
        this.creditLimit = creditLimit;
    }
    @Override
    public void Deposit(double amount) {
        this.balance+=amount;

    }

    @Override
    public double Withdraw(double amount) {
        if (amount<=this.balance){
            this.balance-=amount;
            return amount;
        }
        else {
            double currentBalance = this.balance;
            this.balance = this.creditLimit;
            return currentBalance - this.creditLimit;
        }
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

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }



    public void setBalance(double balance) {
        this.balance = balance;
    }
}