package testes;

public class Poupanca extends Conta {
	
	public Poupanca() {}

	public Poupanca(int id_Conta, String titular, Double saldo, Double limite_Credito) {
		super(id_Conta, titular, saldo, limite_Credito);
	}
	
	@Override
	public void Deposito(double deposito) { 
	
		if(deposito < 999) { Saldo+=deposito; 	}
		
		else {  System.out.println("Valor Muito alto para uma conta Poupança!");}
		
	}

	
	@Override
	public void Saque(double saque) { Saldo-=(saque+5); }
	@Override
	public String Consulta() { return "O saldo atual é: "+Saldo; }

	
	
	

}
