package praticas;

import java.util.Scanner;

public class A006_Estrutura_Repeticao_While {

	public static final String ANSI_GREEN = "\u001B[32m";// para mudar a cor do texto
	public static final String ANSI_RESET = "\u001B[0m";// para resetar

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int senha = 2020;

		System.out.print("Digite sua senha:");
		int tentativa = sc.nextInt();

		while (tentativa != senha) {

			System.err.println("Senha Incorreta...Digite Novamente: ");
			tentativa = sc.nextInt();

		}

		System.out.println(ANSI_GREEN + "Sucesso, Programa Encerrado");
		sc.close();

	}

}
