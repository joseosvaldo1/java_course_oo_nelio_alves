package application;

import entities.Client;

public class Program {
	public static void main(String[] args) {
		// Equals and HasCode:
		
		// Equals: Método que compara se o objeto é igual a outro, retornando true ou false:
		
		// String a = "Maria";
		// String b = "Alex";
		// System.out.println(a.equals(b));  // => false
		
		// HashCode: Método que retorna um número inteiro representando um código gerado
		// a partir das informações do objeto.
		
		// System.out.println(a.hashCode());  // => 74113750
		// System.out.println(b.hashCode());  // => 2043454
		
		// System.out.println("Aa".hashCode());  // => 2112
		// System.out.println("BB".hashCode());  // => 2112
		
		// Regra de ouro do HashCode: 
		// * Se o hasCode de dois objetos for diferente, então os 
		// dois objetos são diferentes.
		
		// * Se o código de dois objetos for igual, muito provavelmente
		// os objetos são iguais (pode haver colisão)
		
		////////////////////////////////////////////////////////////////
		
		Client c1 = new Client ("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		String s1 = "Test";
		String s2 = "Test";
		
		String s3 = new String("Test"); 
		String s4 = new String("Test"); 
		
		System.out.println(c1.hashCode());  // => -602288624
		System.out.println(c2.hashCode());  // => -602288624
		System.out.println(c1.equals(c2));  // => true   // => Mesmo conteúdo
		System.out.println(c1 == c2);       // => false  // => Diferentes referências em memória
		
		System.out.println(s1 == s2);       // => true
		System.out.println(s3 == s4);       // => false
		
		
		
	}
}
