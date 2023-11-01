package curso_java_parte_1;

import java.util.Locale;
import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num, qtd;
		
		num = sc.nextInt();
		qtd = sc.nextInt();
		

		if (num == 1) {
			System.out.println("Total: R$ " + qtd * 4);
		}
		else if (num == 2) {
			System.out.println("Total: R$ " + qtd * 4.5);
		}
		else if (num == 3) {
			System.out.println("Total: R$ " + qtd * 5);
		}
		else if (num == 4) {
			System.out.println("Total: R$ " + qtd * 2);
		}
		else if (num == 5) {
			System.out.println("Total: R$ " + qtd * 1.5);
		}
		else {
			System.out.println("Não encontramos o código do produto");
		}
		
		
		sc.close();
		
	}

}
