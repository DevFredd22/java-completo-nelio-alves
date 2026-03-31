package entidades;

public class A031_ImportedProduct extends A031_Product {

	private Double customsFee;

	public A031_ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public Double totalPrice() {
		return getPrice() + customsFee;
		
	}
	
	@Override
	
	public String priceTag() {
		
		return getName() 
				+ " $ " 
				+ String.format("%.2f ", totalPrice())
				+"customFee: $ "
				+String.format("%.2f",customsFee)
				+")";
		
	}
	
	

}
