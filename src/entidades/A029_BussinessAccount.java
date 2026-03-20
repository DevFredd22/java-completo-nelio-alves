package entidades;

public class A029_BussinessAccount extends A029_Account {

	private Double LoanLimit;
	
	public A029_BussinessAccount(){
		super();
	}

	public A029_BussinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		LoanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return LoanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		LoanLimit = loanLimit;
	}

	public void loan(double amount) {

		if(amount<= LoanLimit) {
			balance+= amount -10.0;
		}
		}

	
	
}
