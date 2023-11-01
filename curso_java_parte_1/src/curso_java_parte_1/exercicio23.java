package curso_java_parte_1;

import java.util.Locale;
import java.util.Scanner;

public class exercicio23 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, quadrado, cubo;
		
		n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			
			quadrado = (int) Math.pow(i, 2);
			cubo = (int) Math.pow(i, 3);
			
			System.out.printf("%d %d %d %n", i, quadrado, cubo);
		}
		sc.close();
		
	}
	
}
