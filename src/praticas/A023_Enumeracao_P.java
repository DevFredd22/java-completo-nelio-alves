package praticas;

public class A023_Enumeracao_P {
	
	public static void main(String[] args) {
		
		A023_Enumeracao_E meuPedido = new A023_Enumeracao_E(101);
		
		meuPedido.setStatus(A023_Enumeracao_Enuns.PROCESSANDO);
		
		meuPedido.Verificar_Entrega();
	}

}
