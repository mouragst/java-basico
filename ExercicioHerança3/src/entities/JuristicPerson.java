package entities;

public class JuristicPerson extends Person {

	private Integer employee;

	public JuristicPerson() {
	}

	public JuristicPerson(String name, Double anualGain, Integer employee) {
		super(name, anualGain);
		this.employee = employee;
	}

	public Integer getEmployee() {
		return employee;
	}

	public void setEmployee(Integer employee) {
		this.employee = employee;
	}

	@Override
	public double tax() {
		double tax = 0;
		if (employee > 10) {
			tax = anualGain * 0.14;
		} else {
			tax = anualGain * 0.16;
		}
		return tax;
	}

}
