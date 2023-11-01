package curso_java_parte_1;

import java.util.Locale;
import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario, salarioTotal;
		
		salario = sc.nextDouble();
		salarioTotal = salario - 2000;
		
		if (salario < 2000) {
			System.out.println("ISENTO");
		}
		else if (salario > 2000 && salario < 3000) {
			System.out.println("R$ " + salarioTotal * 0.08);
		}
		else if (salario > 3000 && salario < 4500) {
			System.out.println("R$ " + salarioTotal * 0.18);
		}
		else {
			System.out.println("R$ " + salarioTotal * 0.28);
		}
		
		sc.close();
		
	}

}
