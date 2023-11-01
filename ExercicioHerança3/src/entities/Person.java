package entities;

public abstract class Person {
	
	private String name;
	protected Double anualGain;
	
	public Person() {
	}

	public Person(String name, Double anualGain) {
		this.name = name;
		this.anualGain = anualGain;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualGain() {
		return anualGain;
	}

	public void setAnualGain(Double anualGain) {
		this.anualGain = anualGain;
	}
	
	public abstract double tax();
	

}
