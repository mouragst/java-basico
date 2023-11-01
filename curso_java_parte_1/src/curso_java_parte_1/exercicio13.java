package curso_java_parte_1;

import java.util.Locale;
import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int senha;
		
		senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha inválida");
			senha = sc.nextInt();
		}
		
		System.out.println("Acessó concedido");
		
		sc.close();
		
	}

}
