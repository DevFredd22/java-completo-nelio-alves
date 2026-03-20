package programas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.A030_OutsourceEmployee;
import entidades.A030_Employee;

public class A030_Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
		
		List<A030_Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			System.out.println("Employee #"+i+" data:");
			System.out.print("Outsourced(y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Hours: ");
			int hours = sc.nextInt();
			System.out.println("value per hour: ");
			double valueperHour = sc.nextDouble();
			
			if(ch=='y') { 
				System.out.println("Additional charge: ");
			    double additionalCharge = sc.nextDouble();
			    list.add(new A030_OutsourceEmployee(name,hours,valueperHour,additionalCharge));
			}
			
			else {list.add(new A030_Employee(name,hours,valueperHour));

			}			
				
			}
		
		System.out.println();
		
		System.out.println("PAYMENT");

		for(A030_Employee emp:list) { System.out.println(emp.getName()+" -$ "+String.format("%.2f",emp.payment()));}
		
		sc.close();	
			
		}
		
	
	
}
