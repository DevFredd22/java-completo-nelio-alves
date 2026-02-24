package praticas;

import java.util.Scanner;

public class A013_Vetores {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String []Estados = new String[4];
		
		// VETORES É UMA ESTRUTURA DE DADOS QUE GUARDA
		// UMA QUANTIDADE ESPECIFICA DE VALORES DEPENDENDENDO DO SEU INDICE
		
		Estados[0] = "Solido";
		Estados[1] = "Liquido";
		Estados[2] = "Gasoso";
		Estados[3] = "Plasma";
		
		for(String todos:Estados) {	System.out.println(todos);	}
	
		String []nomes = {"Igris","Rodolfo"};
		
		System.out.println("\n"+nomes[0]+"\n"+nomes[1]);
		
		sc.close();
	}

}
