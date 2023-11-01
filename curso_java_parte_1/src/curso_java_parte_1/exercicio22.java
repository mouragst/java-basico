package curso_java_parte_1;

import java.util.Locale;
import java.util.Scanner;

public class exercicio22 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, x;
		
		n = sc.nextInt();
		x = 0;
		
		for (int i=1; i<=n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			};
		
		sc.close();
		}
	}

}
