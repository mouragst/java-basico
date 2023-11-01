package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("How many employees? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char answer = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			if (answer == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				Employee empOut = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(empOut);
			} else {
				Employee emp = new Employee(name, hours, valuePerHour);
				list.add(emp);
			}
		}

		System.out.println();
		System.out.println("PAYMENTS: ");
		for (Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + emp.payment());
		}

		sc.close();
	}

}
