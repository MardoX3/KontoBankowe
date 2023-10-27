package pl.gornik;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("12345678901234567",5000);
        System.out.println(account);
        System.out.println("Twoj numer konta: "+account.getNumberAccount());
        account.setAccountBalance(-5500);
        System.out.println(account.getAccountBalance());

        account.deposit(500);
        System.out.println("saldo po wplacie "+ account.getAccountBalance());
        account.payCheck(1000);
        System.out.println("saldo po wylacie "+ account.getAccountBalance());

        int TimeDeposit = 1;
        double amount = 2000;
        double termPercent = 10;
        LocalTime startTime = LocalTime.now();
        LocalTime endTime = startTime.plusMinutes(TimeDeposit);
        String end = "";
        Scanner scanner = new Scanner(System.in);
        while(!end.equals("stop")){
            System.out.println("poczkeaj i potem wpisz: stop");
            end = scanner.next();
        }
        LocalTime timeNow = LocalTime.now();
        System.out.println();
        System.out.println("przed lokatą: "+account.getAccountBalance());
        TermDeposit termDeposit = new TermDeposit(TimeDeposit, amount, termPercent, startTime);
        account.setAccountBalance(account.getAccountBalance() - amount);
        if(timeNow.isBefore(endTime)){
            System.out.println("Lokata trwa");
        }
        else {
            account.setAccountBalance(
                    account.getAccountBalance()
                            + termDeposit.calculateProfit());
            System.out.println("po lokacie: " + account.getAccountBalance());
        }
    }
}