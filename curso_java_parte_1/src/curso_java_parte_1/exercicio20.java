package curso_java_parte_1;

import java.util.Locale;
import java.util.Scanner;

public class exercicio20 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n, a, b;
		
		n = sc.nextInt();
		a = 0;
		b = 0;
		
		for (int i=0; i<n; i++) {
			
			a = sc.nextDouble();
			b = sc.nextDouble();
			
			if (b == 0) {
				System.out.println("Divisão Impossivel");
			}
			else {
				double soma = a / b;
				System.out.println(soma);
			}
		}
		
		sc.close();

	}

}
