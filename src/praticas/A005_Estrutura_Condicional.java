package praticas;

public class A005_Estrutura_Condicional {
	
	public static void main(String[] args) {
		
		int Idade = 18;
		String Msg18="Você é maior de Idade, então pode tirar habilitação.";
		String Msg17="Você não é maior de idade, está perto...Espere mais um pouco!";
		String Msg16="Vocẽ não é maior de idade, então não pode tirar a carteira de motorista.";
		
		if(Idade>17) {	System.out.println(Msg18); }
		
		else if(Idade==17) {  System.out.println(Msg17); }
		
		else {	System.out.println(Msg16);	}
	
	}
	
}
