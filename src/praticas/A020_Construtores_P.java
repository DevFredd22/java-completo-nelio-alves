package praticas;

import java.util.Scanner;

public class A020_Construtores_P {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite Seu nome: ");
		String MeuNome = sc.next();

		System.out.println("Digite Sua Idade: ");
		int MinhaIdade = sc.nextInt();

		System.out.println("Voce tem carro?\n(1)Sim\n(2)Não");
		int resposta = sc.nextInt();

		if (resposta == 1) {

			System.out.println("Qual Marca? ");
			String marca = sc.next();

			A020_Contrutores_E dados1 = new A020_Contrutores_E(MeuNome, MinhaIdade, marca);
			dados1.resposta = resposta;

			System.out.println(dados1.Mensagem());
		}

		else {

			A020_Contrutores_E dados2 = new A020_Contrutores_E(MeuNome, MinhaIdade);
			dados2.resposta = resposta;

			System.out.println(dados2.Mensagem());
		
		}

		sc.close();
	}

}
