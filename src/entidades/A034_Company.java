package entidades;

public class A034_Company extends A034_TaxPayer {

	private Integer numberofEmployees;

	public A034_Company(String name, Double anualIncome, Integer numberofEmployees) {
		super(name, anualIncome);
		this.numberofEmployees = numberofEmployees;
	}

	public Integer getNumberofEmployees() {
		return numberofEmployees;
	}

	public void setNumberofEmployees(Integer numberofEmployees) {
		this.numberofEmployees = numberofEmployees;
	}

	@Override
	public Double tax() {
		if (numberofEmployees > 10) {

			return getAnualIncome() * 0.14;
		}

		else {

			return getAnualIncome() * 0.16;
		}

	}
}
