package application;

public class Program {

	public static void main(String[] args) {
		/*
		 *Boxing: 
		 *É o processo de conversão de um objeto tipo valor 
		 *para um objeto tipo referência compatível. 
		 *Exemplo:
		 * int x = 20x
		 * Object obj = x;
		 * 
		 * Unboxing
		 • É o processo de conversão de um objeto tipo referência para um
		 * objeto tipo valor compatível.
		 * Exemplo:
		 * int x = 20x
		 * Object obj = x;
		 * y = (int) onj;
		 * 
		 * Wrapper classes
		 • São classes equivalentes aos tipos primitivos
		 • Boxing e unboxing é natural na linguagem
		 • Uso comum: campos de entidades em sistemas de informação (IMPORTANTE!)
		 • Pois tipos referência (classes) aceitam valor null e usufruem dos 
		 * recursos OO (orientação a objeto)
		 
		 */
		
//		int x = 20;
//		Object obj = x;
//		
//		System.out.println(obj);  // => 20
//		
//		int y = (int) obj;
//		System.out.println(y);    // => 20
		
		
		int x = 20;
		Integer obj = x;
		
		System.out.println(obj);  // => 20
		
//		int y = obj;
//		System.out.println(y);    // => 20
		
		int y = obj*2;
		System.out.println(y);    // => 40
		

	}

}
