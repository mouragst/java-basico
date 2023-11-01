package curso_java_parte_1;

import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		triangulo = (a * c) / 2;
		circulo = 3.14 * Math.pow(c, 2);
		trapezio = ((a + b) * c) / 2;
		quadrado = Math.pow(b, 2);
		retangulo = a * b;
		
		System.out.printf("TRIANGULO: %.2f %n", triangulo);
		System.out.printf("CIRCULO: %.2f %n", circulo);
		System.out.printf("TRAPEZIO: %.2f %n", trapezio);
		System.out.printf("QUADRADO: %.2f %n", quadrado);
		System.out.printf("RETANGULO: %.2f %n", retangulo);
		
		sc.close();
		
	}

}
