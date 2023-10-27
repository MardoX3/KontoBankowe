package pl.gornik;

import java.time.LocalTime;

public class TermDeposit {
    private int timeDeposit;
    private double amount;
    private double termPercent;
    private LocalTime start;

    public TermDeposit(int timeDeposit, double amount, double termPercent, LocalTime start) {
        this.timeDeposit = timeDeposit;
        this.amount = amount;
        this.termPercent = termPercent;
        this.start = start;
    }

    public double calculateProfit() {
        return Math.round(amount * (1 + termPercent / 100 * timeDeposit / 12));
    }
}
