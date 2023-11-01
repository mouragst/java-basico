package curso_java_parte_1;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, qtd1, qtd2;
		double price1, price2;
		
		cod1 = sc.nextInt();
		qtd1 = sc.nextInt();
		price1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		qtd2 = sc.nextInt();
		price2 = sc.nextDouble();
		
		double total = qtd1 * price1 + qtd2 * price2;
		
		System.out.println("VALOR A PAGAR: " + total);
		
		sc.close();
		
	}

}
