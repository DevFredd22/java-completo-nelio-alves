package programas;

import entidades.A029_Account;
import entidades.A029_BussinessAccount;
import entidades.A029_SavingsAccount;

public class A029_Program {

	public static void main(String[] args) {
		 
		A029_Account acc = new A029_Account(1001,"Alex",0.0);
		A029_BussinessAccount bacc = new A029_BussinessAccount(1002,"Maria",0.0,500.0);
	
	  //UPCASTING
		
		A029_Account acc1 = bacc;
		A029_Account acc2 = new A029_BussinessAccount(1003,"Bob",0.0,200.0);
	    A029_Account acc3 = new A029_SavingsAccount(1004,"Anna",0.0,0.1);
	
	    
	    //DOWCASTING
	    
	    A029_BussinessAccount acc4 = (A029_BussinessAccount) acc2;
	    acc4.loan(100.0);
	    
	    //A029_BussinessAccount acc5 = (A029_BussinessAccount) acc3;
	    
	    if(acc3 instanceof A029_BussinessAccount) {
	    	
	    	A029_BussinessAccount acc5 =(A029_BussinessAccount) acc3;
	    	acc5.loan(200.0);
	    	System.out.println("Loan!");
	    	
	    }
	    
	    if(acc3 instanceof A029_SavingsAccount) {
	    	
	    	A029_SavingsAccount acc5 = (A029_SavingsAccount) acc3;
	        acc5.updateBalance();
	        System.out.println("Update!");
	    
	    }
	    
	}
	
}
