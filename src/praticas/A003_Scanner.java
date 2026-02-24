package praticas;

import java.util.Scanner;

public class A003_Scanner {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Classe que permite inserção de dados
		
		String nome = sc.next();
		
		System.out.println(nome);
		
		sc.close();
	}

}
