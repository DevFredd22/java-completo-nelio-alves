package entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class A031_UsedProduct extends A031_Product {

	private LocalDate manufactureDate;

	public A031_UsedProduct(String name, Double price, LocalDate manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		
		return getName()
				+" (used) $ "
				+String.format("%.2f", getPrice())
				+" (Manufacture date: "
				+manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
				+")";
	}
	
	

	
	
}
