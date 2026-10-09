package application;

public class Program {

	public static void main(String[] args) {
	/*
	* Laço "for each":
	* Sintaxe opcional e simplificada para percorrer coleções.
	* Sintaxe:
	for (Tipo apelido : coleção) {
		<comando 1>
		comando 2>
	}

	*/
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
//		Usando o for comum:
		for(int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
//		 Saída / Output:
//		 Maria
//		 Bob 
//		 Alex
		
		System.out.println("------------------");
		
//		Usando o for each:
		for(String obj : vect) {
			System.out.println(obj);
		}
		
//		 Saída / Output:
//		 Maria
//		 Bob 
//		 Alex

	}

}
