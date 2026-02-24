package praticas;

import java.util.Scanner;

public class A012_Operacao_Bitwise {

	public static void main(String[] args) {

		//Honestamente não sei para que serve...
		Scanner sc = new Scanner(System.in);

		int mask = 0b10000000;

		int n = sc.nextInt();

		if ((n & mask) != 0) {

			System.out.println("6th bit is true!");
		}

		else {
			System.out.println("6th it is false");
		}

		sc.close();
	}
}
