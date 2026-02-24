package praticas;

public class A024_Enuns_E {

	private double Saldo;
	public double preco = 25;
	public String Item = "Fone de Ouvido";
	
	public A024_Enuns_E() {
	}

	public A024_Enuns_E(double saldo, A024_Enuns_Enuns status) {

		this.Saldo = saldo;
		status = A024_Enuns_Enuns.valueOf("AGUARDANDO");

	}

	public void setStatus(A024_Enuns_Enuns NovoStatus) {
	}

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double saldo) {
		Saldo = saldo;
	}

	public void Verificar_Pagamento() {

		if (getSaldo() < preco) {
			System.out.println("Saldo Insuficiente Operacao: " + A024_Enuns_Enuns.valueOf("NEGADO"));

		}

		else {

			System.out.println("Operacao Realizada Com sucesso! " + A024_Enuns_Enuns.valueOf("APROVADO"));

		}

	}
}
