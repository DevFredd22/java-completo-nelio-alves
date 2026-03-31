package entidades;

public abstract class A032_Account {

	private Integer Number;
	private String Holder;
	protected Double Balance;

	public A032_Account() {
	}

	public A032_Account(Integer number, String holder, Double balance) {
		Number = number;
		Holder = holder;
		Balance = balance;
	}

	public Integer getNumber() {
		return Number;
	}

	public void setNumber(Integer number) {
		Number = number;
	}

	public String getHolder() {
		return Holder;
	}

	public void setHolder(String holder) {
		Holder = holder;
	}

	public Double getBalance() {
		return Balance;
	}

	public void withdraw(double amount) {

		Balance -= amount + 5.0;
	}

	public void deposit(double amount) {

		Balance += amount;
	}

}
