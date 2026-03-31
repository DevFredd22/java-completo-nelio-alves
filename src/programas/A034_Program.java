package programas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.A034_Company;
import entidades.A034_Individual;
import entidades.A034_TaxPayer;

public class A034_Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		List<A034_TaxPayer> list = new ArrayList<>();

		System.out.println("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("Tax payer #" + i + " Data:");
			System.out.println("Individual Of Company (i/c)?");
			char type = sc.next().charAt(0);
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.println("Anual Income: ");
			double income = sc.nextDouble();

			if (type == 'i') {

				System.out.println("Heath expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new A034_Individual(name, income, healthExpenditures));

			}

			else {

				System.out.print("Number of employees:");
				int numberOfEmployees = sc.nextInt();
				list.add(new A034_Company(name, income,numberOfEmployees));
			}

		}

		double sum = 0.0;
		System.out.println();
		System.out.println("TAXES PAID: ");
		for (A034_TaxPayer tp : list) {

			double tax = tp.tax();
			System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));
			sum += tax;
		}

		System.out.println();
		System.out.println("TOTAL TAXES: $" + String.format("%.2f", sum));

		sc.close();
	}

}
