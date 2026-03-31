package programas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.A032_Account;
import entidades.A032_BussinersAccount;
import entidades.A032_SavingAccount;

public class A032_Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		List<A032_Account> list = new ArrayList<>();
		
		list.add(new A032_SavingAccount(1001,"Alex",500.00,0.01));
		list.add(new A032_BussinersAccount(1002,"Maria",1000.0,400.0));
		list.add(new A032_SavingAccount(1004,"Bob",300.0,0.01));
		list.add( new A032_BussinersAccount(1005,"Ana",500.0,500.0));
		
		double soma = 0.0;
		
		for(A032_Account acc:list) {
			
			soma+=acc.getBalance();
			
		}
		
		System.out.printf("Total Balance: %.2f",soma);
		
		for(A032_Account acc: list) {
			
			acc.deposit(10.0);
		}
		
		for(A032_Account acc: list) {
			
			System.out.printf("\nUpdated Balance for account %d: %.2f \n",acc.getNumber(),acc.getBalance());
		}
		
	}

}
