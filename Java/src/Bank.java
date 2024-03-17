import java.util.ArrayList;
import java.util.List;

public class Bank implements IBank {
    private List<IAccount> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    @Override
    public void OpenAccount(IAccount account) {
        this.accounts.add(account);

    }

    @Override
    public void CloseAccount(int accountNumber) {
        for (IAccount account : this.accounts) {
            if (account.GetAccountNumber() == accountNumber) {
                if (account.GetCurrentBalance() < 0) {
                    System.out.println("account is not closed due to debt");
                } else {
                    this.accounts.remove(account);
                    break;
                }
            }
        }

    }

    @Override
    public List<IAccount> GetAllAccounts() {
        return this.accounts;
    }

    @Override
    public List<IAccount> GetAllAccountsInDebt() {
        List<IAccount> debtAccounts = new ArrayList<>();

        for (IAccount account : this.accounts) {
            if (account.GetCurrentBalance() < 0) {
                debtAccounts.add(account);
            }
        }
        return debtAccounts;
    }

    @Override
    public List<IAccount> GetAllAccountsWithBalance(double balanceAbove) {
        List<IAccount> biggerBalanceAccounts = new ArrayList<>();
        for (IAccount account : this.accounts) {
            if (account.GetCurrentBalance() > 0) {
                biggerBalanceAccounts.add(account);

            }
        }
        return biggerBalanceAccounts;
    }
}