package application;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double sum = 0;
		double avgHeight;
		int n = sc.nextInt();
		People[] vect = new People[n];
		
		for (int i=0; i<vect.length;i++) {
			sc.nextLine();
			String name = sc.nextLine();
			int age = sc.nextInt();
			double height = sc.nextDouble();
			vect[i] = new People(name, age, height);
			sum += vect[i].getHeight();
		}
		
		avgHeight = sum / vect.length;
		System.out.printf("Altura média: %.2f%n", avgHeight);
		
		for (int i=0; i<vect.length; i++) {
			if (vect[i].getAge() < 16) {
				System.out.println(vect[i].getName());
			}
		}
		
		
		sc.close();
	}

}
