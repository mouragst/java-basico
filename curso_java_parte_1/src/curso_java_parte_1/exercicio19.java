package curso_java_parte_1;

import java.util.Locale;
import java.util.Scanner;

public class exercicio19 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, fat;
		
		n = sc.nextInt();
		fat = 1;
		
		for (int i=1; i<=n; i++) {
			fat *=  i;
		}
		
		System.out.println(fat);
		
		sc.close();

	}

}
