package entities;

import entitiesenum.Color;

public class Circle extends Shape {

	private double radius;

	public Circle() {
	}

	public Circle(Color color, double radius) {
		super(color);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return 3.14159 * (radius * radius);
	}

	public String toString() {
		return String.format("%.2f", area());
	}

}
