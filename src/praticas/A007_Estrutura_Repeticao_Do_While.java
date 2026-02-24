package praticas;


public class A007_Estrutura_Repeticao_Do_While {

	public static void main(String[] args) {
		
//O DO independente da verificação da estrutura while, ele roda pelo menos 1 vez.
		int contador = 0;
		do {
			System.out.println("Contando: " + contador);
			contador++;
		} while (contador <= 3);
	}
}
