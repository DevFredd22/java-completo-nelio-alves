package entidades;

public class A029_SavingsAccount extends A029_Account {

	private Double interestRate;
	
	public A029_SavingsAccount() {super();}

	public A029_SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public void updateBalance() {
		balance += balance * interestRate;
		
	}
	
	
}
