package praticas;

public class A001_Tipos_Sysout {
	
	public static void main(String[] args) {
		
		String a = "Formatação";

		System.out.print("Sem Quebra de Linha");
		System.out.println("\nCom Quebra de Linha");
		System.out.printf("Com %s",a);
		System.err.println("\nPara erros ");
	}

}
