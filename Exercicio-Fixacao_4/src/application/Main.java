package application;

import entities.BankData;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        BankData bd;

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.next();
        String holder = sc.nextLine();
        System.out.print("Is there an initial deposit? (y/n)");
        char response = sc.next().charAt(0);

        if (response == 'y'){
            System.out.print("Enter initial deposit: ");
            double initialDeposit = sc.nextDouble();
            bd = new BankData(accountNumber, holder, initialDeposit);
        }
        else {
            bd = new BankData(accountNumber, holder);
        }

        System.out.println("Account data: ");
        System.out.println(bd);
        System.out.println();

        System.out.print("Enter a deposit value: ");
        double amount = sc.nextDouble();
        bd.deposit(amount);
        System.out.println("Updated data: ");
        System.out.print(bd);
        System.out.println();
        System.out.println();
        System.out.print("Enter a withdraw value: ");
        amount = sc.nextDouble();
        bd.withdraw(amount);
        System.out.println("Updated data: ");
        System.out.println(bd);

    }
}