package praticas;

import java.util.Scanner;

public class A017_Membros_Estaticos {

	public static void main(String[] args) {

		//Membros Estaticos Podem ser usados em toda a classe
		Calculo();
	}

	public static void Calculo() {
		Scanner sc = new Scanner(System.in);
		double primeiro;
		double segundo;
		double resultado;

		String mensagem_0 = "Digite o Numero: ";
		String mensagem_1 = "Digite o Segundo: ";
		String Mensagem_2 = "Qual Calculo Voce Deseja Fazer?\n(1)Adição\n(2)Subtração\n(3)Divisão\n(4)Multiplicação";
		int resposta = 0;

		System.out.println(mensagem_0);
		primeiro = sc.nextDouble();

		System.out.println(mensagem_1);
		segundo = sc.nextDouble();

		System.out.println(Mensagem_2);
		resposta = sc.nextInt();

		sc.close();

		if (resposta > 4 || resposta < 1) {

			System.out.println("Invalido\n Escolha uma das Opções:");
			resposta = sc.nextInt();

		}

		switch (resposta) {
		case 1: {
			resultado = primeiro + segundo;
			System.out.println("O Resultado é: " + resultado);
			break;

		}

		case 2: {
			resultado = primeiro - segundo;
			System.out.println("O Resultado é: " + resultado);
			break;

		}

		case 3: {
			resultado = primeiro / segundo;
			System.out.println("O Resultado é: " + resultado);
			break;

		}

		case 4: {
			resultado = primeiro * segundo;
			System.out.println("O Resultado é: " + resultado);
			break;

		}
		default:
			throw new IllegalArgumentException("ERRO!");
		}

	}

}
