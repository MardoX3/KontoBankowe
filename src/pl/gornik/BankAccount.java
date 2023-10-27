package pl.gornik;

public class BankAccount {
    private String numberAccount;
    private double accountBalance;

    public BankAccount(String numberAccount, double accountBalance) {
        int size = numberAccount.length();
        if(numberAccount.length() == 26){
            this.numberAccount = numberAccount;
        }
        else if(numberAccount.length() < 26){
            for(int i = 0;26- size > i; i++){
                numberAccount += "0";
            }
            this.numberAccount = numberAccount;
        }
        if(accountBalance >= 0){
            this.accountBalance = accountBalance;
        }
    }

    public String getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(String numberAccount) {
        this.numberAccount = numberAccount;
    }

    public void setAccountBalance(double accountBalance) {
        if(accountBalance >= 0){
            this.accountBalance = accountBalance;
        }
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void deposit(double amount){
        accountBalance += amount;
    }
    public void payCheck(double amount){
        accountBalance -= amount;
    }

    @Override
    public String toString() {
        return "numberkonta= " + numberAccount +
                " saldo= " + accountBalance;
    }
}
