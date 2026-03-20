package entidades;

public class A030_OutsourceEmployee extends A030_Employee {

	private Double additionalCharge;
	
	public A030_OutsourceEmployee() {super();}

	public A030_OutsourceEmployee(String name, Integer hours, Double valuePerhour, Double additionalCharge) {
		super(name, hours, valuePerhour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public double payment() {
		return super.payment()+additionalCharge*1.1;
	}

	
	
}
