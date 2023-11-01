package curso_java_parte_1;

import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int produto = (a*b) - (c*d);
		
		System.out.printf("DIFERENÇA = %d", produto);
		
	}

}
