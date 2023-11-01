package curso_java_parte_1;

import java.util.Locale;
import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double num;
		
		num = sc.nextDouble();
		
		if (num % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
		
		sc.close();
		
	}

}
