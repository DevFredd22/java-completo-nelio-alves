package programas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.A033_Circle;
import entidades.A033_Rectangle;
import entidades.A033_Shape;
import entidades.enuns.A033_Color;

public class A033_Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		List<A033_Shape> list = new ArrayList<>();

		System.out.println("Enter the number of shapes: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle(r/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("\nColor (BLACK/BLUE/RED): ");
			A033_Color color = A033_Color.valueOf(sc.next());
			if (ch == 'r') {
				System.out.println("width: ");
				double width = sc.nextDouble();
				System.out.println("Height: ");
				double height = sc.nextDouble();
				list.add(new A033_Rectangle(color, width, height));

			}

			else {

				System.out.println("Radius: ");
				double radius = sc.nextDouble();
				// list.add(new A033_Circle(color,radius));
				list.add(new A033_Circle(color, radius));
			}
		}

		System.out.println();

		System.out.println("SHAPE AREAS: ");
		for (A033_Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}
	}

}
