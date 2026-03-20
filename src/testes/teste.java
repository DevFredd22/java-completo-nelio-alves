package testes;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {

		Conta conta = new Poupanca(1010, "Miguel", 100.0, 0.0);

		Scanner sc = new Scanner(System.in);

		if (conta instanceof Poupanca) {

			Poupanca conta1 = (Poupanca) conta;
			System.out.println("Digite o valor do saque");
			double saque = sc.nextDouble();

			conta1.Saque(saque);
			System.out.println(conta.Consulta());
		}
		
		else {

			System.out.println("Este objeto não é uma Poupança,");

	}
	}
	
}
