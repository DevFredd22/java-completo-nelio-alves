package programas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.A031_ImportedProduct;
import entidades.A031_Product;
import entidades.A031_UsedProduct;

public class A031_Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<A031_Product> list = new ArrayList<>();

		System.out.print("Digite o Numero de Produtos: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("\nDados do Produto #" + i + ":");
			System.out.println("Comum, Usado, Importado (c/u/i)");
			char type = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.next();
			System.out.print("\nPreco: ");
			double price = sc.nextDouble();
			if (type == 'c') {
				list.add(new A031_Product(name, price));
			}

			else if (type == 'u') {
				System.out.println("Data de Fabricação (DD/MM/YYYY)");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new A031_UsedProduct(name, price, date));

			}

			else {

				System.out.println("Taxa de Importação: ");
				double customsFee = sc.nextDouble();
				list.add(new A031_ImportedProduct(name, price, customsFee));

			}

		}

		System.out.println();
		System.out.println("ETIQUETAS DE PRECO:");
		for (A031_Product produto : list) {

			System.out.println(produto.priceTag());
		}

		sc.close();
	}

}
