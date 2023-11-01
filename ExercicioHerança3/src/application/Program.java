package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.JuristicPerson;
import entities.NaturalPerson;
import entities.Person;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Person> list = new ArrayList<>();
		int n = 0;

		System.out.print("Enter the number of tax payers: ");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or Company (i/c)? ");
			char answer = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			double anualGain = sc.nextDouble();
			if (answer == 'i') {
				System.out.print("Health expenditures: ");
				double healthCare = sc.nextDouble();
				Person naturalPerson = new NaturalPerson(name, anualGain, healthCare);
				list.add(naturalPerson);
			} else if (answer == 'c') {
				System.out.print("Number of employees: ");
				int employee = sc.nextInt();
				Person juristicPerson = new JuristicPerson(name, anualGain, employee);
				list.add(juristicPerson);
			}
		}

		System.out.println();
		System.out.println("TAXES PAID: ");
		double sumTax = 0;
		for (Person person : list) {
			System.out.println(person.getName() + ": $ " + String.format("%.2f", person.tax()));
			sumTax += person.tax();
		}
		
		System.out.println();
		System.out.println("Total taxes: " + sumTax);

		sc.close();
	}

}
