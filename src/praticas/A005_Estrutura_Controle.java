package praticas;

public class A005_Estrutura_Controle {
	
	public static void main(String[] args) {
		
		double media=6;
		
		switch ((int) media) {//Essa tecnica de transforma um tipo de varivel para outro se chama CASTING
		
		case 8: {System.out.println("Voce esta acima da media"); break; }
		
		case 7:{ System.out.println("Voce Está na media"); break; }
		
		default: System.out.println("Voce foi reprovado");
	
		}
		
	}

}
