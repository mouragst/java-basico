package curso_java_parte_1;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int id = sc.nextInt();
		int salaryHour = sc.nextInt();
		double hour = sc.nextDouble();
		
		double salary = salaryHour * hour;
		
		System.out.println("ID NUMBER = " + id);
		System.out.println("SALARY = U$ " + salary);
		
		sc.close();
		
	}

}
