package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		student.name = sc.next();
		student.n1 = sc.nextDouble();
		student.n2 = sc.nextDouble();
		student.n3 = sc.nextDouble();
		System.out.println("FINAL GRADE = " + student.finalGrade());
		if (student.finalGrade() >= 60) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", Math.abs(student.finalGrade() - 60));
		}

	}

}
