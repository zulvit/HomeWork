package HomeWorkMiit.module3.Number2;

public class BankAccount {
    private int id;
    private double balance;
    private final static double DEFAULT_INTEREST_RATE = 0.02;
    private static double interestRate = DEFAULT_INTEREST_RATE;
    private static int bankAccount = 0;

    public BankAccount() {
        this.id = bankAccount++;
        System.out.println("Account ID" + bankAccount + " created");
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    double getInterest(int years) {
        return BankAccount.interestRate * years * this.balance;
    }

    void deposit(double amount) {
        this.balance += amount;
    }
}
