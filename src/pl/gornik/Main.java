package pl.gornik;

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("12345678901234567",565.32);
        System.out.println(account);
        System.out.println("Twoj numer konta: "+account.getNumberAccount());
        account.setAccountBalance(account.getAccountBalance()-50000);
        System.out.println(account.getAccountBalance());
    }
}