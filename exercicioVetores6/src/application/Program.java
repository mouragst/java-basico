package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		double media = 0;
		double[] vect = new double[n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.printf("Digite um numero: ");
			vect[i] = sc.nextDouble();
			media += vect[i];
		}
		
		media = media / n;
		
		System.out.println("MEDIA DO VETOR = " + media);
		
		System.out.println("Elementos abaixo da média:");
		
		for (int i=0; i<vect.length; i++) {
			if (media > vect[i]) {
				System.out.println(vect[i]);
			}
		}
		
		
	}

}
