package curso_java_parte_1;

import java.util.Locale;
import java.util.Scanner;

public class exercicio15 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigo, alcool, gasolina, diesel;

		alcool = 0;
		gasolina = 0;
		diesel = 0;

		codigo = sc.nextInt();

		while (codigo != 4) {
			if (codigo == 1) {
				alcool += 1;
			} else if (codigo == 2) {
				gasolina += 1;
			} else if (codigo == 3) {
				diesel += 1;
			}
			codigo = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO!");
		System.out.printf("Alcool: %d %n", alcool);
		System.out.printf("Gasolina: %d %n", gasolina);
		System.out.printf("Diesel: %d %n", diesel);

		sc.close();

	}

}
