package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros você vai digitar?");
		int n, posicao;
		double maior;
		n = sc.nextInt();
		double[] vect = new double[n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		maior = vect[0];
		posicao = 0;
		
		for (int i=0; i<vect.length; i++) {
			if(vect[i] > maior) {
				maior = vect[i];
				posicao = i;
			}
			
			System.out.println("Maior: " + maior);
			System.out.println("Posição do maior: " + posicao);
			
		}
		
		
		sc.close();
	}

}
