package HomeWorkMiit.module3;

public class Module2 {
    public static void main(String[] args) {

    }
}

class BankAccount {
    private final static double DEFAULT_INTEREST_RATE = 0.02;
    private static double interestRate = DEFAULT_INTEREST_RATE;
    private static int bankAccountCount = 1;
    private int id;
    private double balance;

    BankAccount() {
        this.id = bankAccountCount++;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public double getInterest(int years) {
        return BankAccount.interestRate * years * this.balance;
    }
}
