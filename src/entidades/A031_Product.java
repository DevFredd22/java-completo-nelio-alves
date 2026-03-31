package entidades;

public class A031_Product {
	
	private String Name;
	private Double Price;
	
	public A031_Product(String name, Double price) {
		Name = name;
		Price = price;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Double getPrice() {
		return Price;
	}

	public void setPrice(Double price) {
		Price = price;
	}
	
	public String priceTag() {
		
		return Name + " $ "+ String.format("%.2f", Price);
	}
	

}
