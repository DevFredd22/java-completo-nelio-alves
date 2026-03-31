package entidades;

public class A034_Individual extends A034_TaxPayer {

	private Double healthExpenditures;

	public A034_Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
	
	@Override
	public Double tax() {

		if(getAnualIncome()<2000.0) {
			
		return getAnualIncome() *0.15 - healthExpenditures *0.5;
		}
		
		else {
			
			return getAnualIncome() * 0.25- healthExpenditures* 0.5;
		}
		}
	
	
	
	
	
	
}
