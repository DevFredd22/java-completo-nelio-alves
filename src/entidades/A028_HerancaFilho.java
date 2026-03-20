package entidades;

public class A028_HerancaFilho extends A028_HerancaPai {

	public int Indice =1;
	public String MeuNome = "Alberto";
	public int MinhaIdade = 22;
	
	
	public A028_HerancaFilho() {}

	public A028_HerancaFilho(String nome, int idade, String[] genero, int indice) {
		super(nome, idade, genero);
		Indice = indice;
	}
	
	@Override
public String Mensagem() {
	
		return String.format("Meu nome é %s, tenho %d de idade e meu genero é %s", MeuNome,MinhaIdade,Genero[Indice]);
	}
	

}
