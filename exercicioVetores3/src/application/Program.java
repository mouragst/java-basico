package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros será digitado?");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		int pares = 0;
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS PARES:");
		
		for (int i=0; i<vect.length; i++) {
			if (vect[i] % 2 == 0) {
				System.out.print(" " + vect[i]);
				pares++;
			}
		}
		
		System.out.println();
		System.out.println("QUANTIDADE DE PARES: " + pares);
		sc.close();
	}

}
