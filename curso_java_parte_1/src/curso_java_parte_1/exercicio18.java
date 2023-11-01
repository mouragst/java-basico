package curso_java_parte_1;

import java.util.Locale;
import java.util.Scanner;

public class exercicio18 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double a, b, c;
		
		n = sc.nextInt();
		a = 0;
		b = 0;
		c = 0;
		
		for(int i=0; i<n; i++) {
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			double media = (a*2 + b*3 + c*5) / 10;
			System.out.println(media);
		}
		
		sc.close();

	}

}
