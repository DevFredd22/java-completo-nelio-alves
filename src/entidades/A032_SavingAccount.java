package entidades;

public class A032_SavingAccount extends A032_Account {

	private Double InterestRate;
	
	public A032_SavingAccount() {
		
		super();
	}

	public A032_SavingAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		InterestRate = interestRate;
	}

	public Double getInterestRate() {
		return InterestRate;
	}

	public void setInterestRate(Double interestRate) {
		InterestRate = interestRate;
	}
	
	
	public void UpdateBalance() {
		
		Balance+=Balance*InterestRate;
	}
	
	@Override
	public final void withdraw(double amount) {
		
		Balance-= amount;
	}
}
