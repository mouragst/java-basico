package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankData;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		BankData bd;
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there an initial deposit? (y/n)");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			bd = new BankData(accountNumber, name, initialDeposit);
		}
		else {
			bd = new BankData(accountNumber, name);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(bd);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double amount = sc.nextDouble();
		bd.deposit(amount);
		System.out.println("Updated account data:");
		System.out.println(bd);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		amount = sc.nextDouble();
		bd.withdraw(amount);
		System.out.println("Updated account data:");
		System.out.println(bd);
		
		sc.close();
	}

}
