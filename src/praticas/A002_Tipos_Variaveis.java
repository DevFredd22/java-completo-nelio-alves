package praticas;

public class A002_Tipos_Variaveis {
	
	public static void main(String[] args) {
		
		//Variaveis Primitivas GUARDAM O VALOR
		
		byte a = 1;             //8  bits -128 a 127
		short b =2;            //16 bits -31000 a 31000
		int c = 10;           // 32 bits 
		double d = 20.5;     //64 bits
		boolean e = true;   //1 bit
		char f = 'd';      //16bits
		long g = 3400;    //64 bits
        float h = 30000; //32 bits
	
        //1 bit Guarda 2 Valores(0 || 1)
        
        //Variaveis Referencia Guarda o Endereço do Valor
        
        int[] idade_Ana = {22};
        int [] Idade_Leo = idade_Ana;

	System.out.println(Idade_Leo[0]);
	}

}
