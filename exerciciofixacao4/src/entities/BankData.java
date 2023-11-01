package entities;

public class BankData {

	private int accountNumber;
	private String name;
	private double balance;
	
	public BankData(int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
	}

	public BankData(int accountNumber, String name, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.name = name;
		deposit(initialDeposit);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5;
	}

	public String toString() {
		return "Account: " + accountNumber + ", Holder: " + name + ", Balance: $ " + balance;
	}
}
