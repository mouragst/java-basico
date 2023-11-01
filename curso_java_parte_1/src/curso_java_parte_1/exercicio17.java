package curso_java_parte_1;

import java.util.Locale;
import java.util.Scanner;

public class exercicio17 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, x, in, out;
		
		n = sc.nextInt();
		x = 0;
		in = 0;
		out = 0;
		
		for (int i=0; i<n; i++) {
			x = sc.nextInt();
			if(x >= 10 && x <= 20) {
				in += 1;
			}
			else {
				out +=1;
			}
		}
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();

	}

}
