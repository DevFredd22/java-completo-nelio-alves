package praticas;

import java.util.Scanner;

public class A024_Enuns_P {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		A024_Enuns_E dados = new A024_Enuns_E();

		System.out.println("Qual seu saldo atual?");
		double saldoAtual = sc.nextDouble();

		dados.setSaldo(saldoAtual);

		A024_Enuns_E dadosAtualizados = new A024_Enuns_E(saldoAtual, A024_Enuns_Enuns.valueOf("AGUARDANDO"));

		dadosAtualizados.Verificar_Pagamento();

		sc.close();
	}

}
