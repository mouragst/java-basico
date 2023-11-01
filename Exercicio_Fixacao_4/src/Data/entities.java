package Data;

public class entities {

    private int accountNumber;
    private String holder;
    private double balance;

    public entities(int accountNumber, String holder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        deposit(initialDeposit);
    }
    public entities(int accountNumber, String holder) {
        this.accountNumber = accountNumber;
        this.holder = holder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
