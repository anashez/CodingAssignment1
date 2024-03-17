public class BasicAccount implements IAccount {
    private int accountNumber;
    private double withdrawalLimit;
    private double balance;

    public BasicAccount(int accountNumber, double withdrawalLimit) {
        this.accountNumber = accountNumber;
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public double Withdraw(double amount) {
        if (this.balance <this.withdrawalLimit){
            this.balance = 0;}
        if (amount <= this.withdrawalLimit && amount <this.balance) {
            this.balance -= amount;
            return amount;
        } else {
            this.balance -= this.withdrawalLimit;
            return this.withdrawalLimit;
        }

    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getWithdrawalLimit() {
        return withdrawalLimit;
    }

    public void setWithdrawalLimit(double withdrawalLimit) {
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void Deposit(double amount) {
        this.balance += amount;
    }


    @Override
    public double GetCurrentBalance() {
        return this.balance;
    }

    @Override
    public int GetAccountNumber() {
        return this.accountNumber;
    }


    public void setBalance(double balance) {
        if (balance > 0) {
            this.balance = balance;
        }
    }
}