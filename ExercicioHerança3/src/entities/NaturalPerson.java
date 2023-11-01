package entities;

public class NaturalPerson extends Person {

	private double healthCare;

	public NaturalPerson() {
	}

	public NaturalPerson(String name, Double anualGain, double healthCare) {
		super(name, anualGain);
		this.healthCare = healthCare;
	}

	public double getHealthCare() {
		return healthCare;
	}

	public void setHealthCare(double healthCare) {
		this.healthCare = healthCare;
	}

	@Override
	public double tax() {
		double tax = 0;
		if (anualGain <= 20000) {
			tax = anualGain * 0.15;
		} else {
			tax = anualGain * 0.25;
		}
		return tax - (healthCare * 0.5);
	}
}
