package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double sum = 0;
		double[] vect = new double[n];
		
		for (int i=0; i<vect.length; i++) {
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}
		
		double media = sum / n;
		
		System.out.print("Valores: ");
		
		for (int i=0; i<vect.length; i++) {
			System.out.printf("%.2f ", vect[i]);
		}
		
		System.out.println();
		System.out.printf("Soma: %.2f%n", sum);
		System.out.printf("Média: %.2f%n", media);
		
		sc.close();
	}

}
