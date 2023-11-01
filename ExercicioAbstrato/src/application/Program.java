package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entitiesenum.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Shape> list = new ArrayList<>();
		int n;

		System.out.print("Enter number of shapes: ");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.println("Rectangle or Circle (r/c)? ");
			char answer = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			if (answer == 'r') {
				System.out.print("Width: ");
				double width = sc.nextInt();
				System.out.print("Height: ");
				double height = sc.nextInt();
				Shape rect = new Rectangle(color, width, height);
				list.add(rect);
			} else if (answer == 'c') {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				Shape circ = new Circle(color, radius);
				list.add(circ);
			}

		}

		System.out.println();
		System.out.println("Shape areas: ");
		for (Shape area : list) {
			System.out.println(area.area());
			sc.close();
		}

	}
}
