package entidades;

public abstract class  A034_TaxPayer {

	private String Name;
	private Double AnualIncome;
	
	public A034_TaxPayer(String name, Double anualIncome) {
		Name = name;
		AnualIncome = anualIncome;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Double getAnualIncome() {
		return AnualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		AnualIncome = anualIncome;
	}

	public abstract Double tax();
	
	
}
