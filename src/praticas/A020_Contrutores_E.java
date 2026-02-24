package praticas;

public class A020_Contrutores_E {

	public String Nome;
	public int Idade;
	public String Carro;
	public int resposta = 2;
	public String msg;

	public A020_Contrutores_E() {

	}

	public A020_Contrutores_E(String nome, int idade) {
		Nome = nome;
		Idade = idade;
	}

	public A020_Contrutores_E(String nome, int idade, String carro) {
		Nome = nome;
		Idade = idade;
		Carro = carro;
	}

	public String Mensagem() {

		if (resposta == 1) { msg = String.format("CADASTRO REALIZADO\nNome: %s\nIdade: %d\nCarro: %s", Nome, Idade,Carro);}
		
		else if (resposta == 2) { msg = String.format("CADASTRO REALIZADO\nNome: %s\nIdade: %d\nCarro: N/A", Nome, Idade); }
		
		else { msg = "ERRO";}

		return msg;
	}

}
