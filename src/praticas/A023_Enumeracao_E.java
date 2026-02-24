package praticas;

public class A023_Enumeracao_E {

	private int id;
	private A023_Enumeracao_Enuns Status;

	public A023_Enumeracao_E(int id) {//CONSTRUTOR COM ARGUMENTO
		this.id = id;
		this.Status = A023_Enumeracao_Enuns.AGUARDANDO;

	}

	public void setStatus(A023_Enumeracao_Enuns novoStatus) {
		this.Status = novoStatus;

	}

	public void Verificar_Entrega() {

		if (this.Status == A023_Enumeracao_Enuns.APROVADO) {

			System.out.println("O Pedido #" + id + " já chegou ao destino.");
		} else {

			System.out.println("O pedido #" + id + " esta em estado: " + Status);
		}

	}

}
