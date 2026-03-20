package testes;

public  class Conta {
		
	public int Id_Conta;
	public String Titular;
	public Double Saldo;
	public Double Limite_Credito;
	
	///////////////////////////////////////////////////////////
	
	public Conta() {}
	
	public Conta(int id_Conta, String titular, Double saldo, Double limite_Credito) {
		Id_Conta = id_Conta;
		Titular = titular;
		Saldo = saldo;
		Limite_Credito = limite_Credito;
	}
	///////////////////////////////////////////////////////////
	
	public  void Deposito(double deposito) { Saldo+=deposito; }
	
	public void Saque(double saque) { Saldo-=saque; }
	
	public String Consulta() { return "O saldo atual é: "+Saldo; }

	///////////////////////////////////////////////////////////
	

	

}
