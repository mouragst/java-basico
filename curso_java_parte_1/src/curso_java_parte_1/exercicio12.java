package curso_java_parte_1;

import java.util.Locale;
import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		y = 0;
		x = sc.nextInt();
		
		while (x != 0) {
			y += x;
			x = sc.nextInt();
			
		}
		
		System.out.println(y);
		
		sc.close();
		
	}

}
