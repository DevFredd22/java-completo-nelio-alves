package praticas;

public class A022_Encapsulamento {

	private String Nome;
	private Double Salario;
	private String Cpf;
	
	public A022_Encapsulamento() {}

	public A022_Encapsulamento(String nome, Double salario, String cpf) {
		Nome = nome;
		Salario = salario;
		Cpf = cpf;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public Double getSalario() {
		return Salario;
	}

	public void setSalario(Double salario) {
		Salario = salario;
	}

	public String getCpf() {
		return Cpf;
	}

	public void setCpf(String cpf) {
		Cpf = cpf;
	}
	
	
	
	
	
	
}
