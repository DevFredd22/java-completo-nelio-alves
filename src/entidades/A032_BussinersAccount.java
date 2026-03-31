package entidades;

public class A032_BussinersAccount extends A032_Account {

	private Double loanLimit;
	
	public A032_BussinersAccount() {
		
		super();
	}

	public A032_BussinersAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	
	
	public void loan(double amount) {
		if(amount <= loanLimit) {
			Balance+= amount -10.0;
			
		}
		
	}
	
	@Override
	public void withdraw(double amount) {
		
		super.withdraw(amount); 
        Balance -= 2.0;
	
	}
	
	
}
