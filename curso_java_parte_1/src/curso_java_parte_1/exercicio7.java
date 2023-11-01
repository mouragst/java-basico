package curso_java_parte_1;

import java.util.Locale;
import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		num = sc.nextInt();
		
		if (num >= 0) {
			System.out.println("POSITIVO");
		}
		else {
			System.out.println("NEGATIVO");
		}
		
		sc.close();
		
	}

}
