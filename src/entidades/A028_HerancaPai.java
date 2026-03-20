package entidades;

public class A028_HerancaPai {
	
	public A028_HerancaPai() {}
	
	public A028_HerancaPai(String nome, int idade, String[] genero) {
		Nome = nome;
		Idade = idade;
		Genero = genero;
	}

	public String Nome;
	public int Idade;
	public String[]Genero = {"","Masculino","Feminino"};
    
	
	public String Mensagem() {
		
		return String.format("Meu nome é %s, tenho %d de idade e meu genero é %s", Nome,Idade,Genero[0]);
	}
	
}
