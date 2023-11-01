package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		int media = 0;
		int countPares = 0;
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		for (int i=0; i<vect.length; i++) {
			if (vect[i] % 2 == 0) {
				media += vect[i];
				countPares++;
			}
		}
		
		if (countPares == 0) {
			System.out.println("NENHUM NUMERO PAR");
		}
		else {
			media = media / countPares;
			System.out.println("Media dos pares: " + media);
		}
		
		sc.close();
	}

}
