public class BasicAccount implements IAccount{
    private int accountNumber;
    private double withdrawalLimit;
    private double balance;
    public BasicAccount(int accountNumber,double withdrawalLimit,double balance){

        this.accountNumber = accountNumber;
        this.withdrawalLimit = withdrawalLimit;
        this.balance = balance;
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
        this.balance=+amount;
    }

    @Override
    public double Withdraw(double amount) {
        if(amount<=this.withdrawalLimit) {
            this.balance=-amount;
            return amount;
        }
            else{
            this.balance=-this.withdrawalLimit;

            return this.withdrawalLimit;
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


    public void setBalance(double balance) {
        this.balance = balance;
    }
}
