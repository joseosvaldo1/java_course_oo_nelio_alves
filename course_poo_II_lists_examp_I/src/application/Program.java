package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
//		Listas:
//		• Lista é uma estrutura de dados:
//		
//		- Homogênea (dados do mesmo tipo)
//		- Ordenada (elementos acessados por meio de posições)
//		- Inicia vazia, e seus elementos são alocados sob demanda
//		- Cada elemento ocupa um "nó" (ou nodo) da lista
//		
//		• Tipo (interface): List
//		• Classes que implementam: ArrayList, LinkedList, etc.
//		
//		• Vantagens:
//		• Tamanho variável
//		• Facilidade para se realizar inserções e deleções
//		• Desvantagens:
//		• Acesso sequencial aos elementos *
//		
//		Observação: Listas não aceitam tipos primitivos. Caso necessitemos
//		de uma lista com tipos primitivos, devemos usar as classes wrapper
//		equivalentes (int => Integer, double -> Double, float -> Float, etc.)
		
		
//		* Alguns métodos das listas:
//		- Tamanho da lista: size()
//		- Obter o elemento de uma posição: get(position)
//		- Inserir elemento na lista: add(obj), add(int, obj)
//		- Remover elementos da lista: remove(obj), remove(int), removeIf(Predicate)
//		- Encontrar posição de elemento: indexOf(obj), lastIndexOf(obj)
//		- Filtrar lista com base em predicado:
//		- List<Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.toList());
//		- Encontrar primeira ocorrência com base em predicado:
//		- Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);
		
		
		List<String> list = new ArrayList<>();
		// List<String> list = new ArrayList<String>()
		
		// Inserindo elementos na lista usando o método add():
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		
		
		
		// Inserir um elemento na posição 2:
		list.add(2, "Marco");
				
				
		// Determinar o tamanho da lista:
		System.out.println(list.size());	
		
		
		
		for(String item : list) {
			System.out.println(item);
		}
		
		System.out.println("--------------");
		
		// Removendo um elemento da lista usando o método remove():
		// Por meio do valor do elemento da lista:
		// list.remove("Anna");	
				
		//Por meio do índicedo elemento:
		// list.remove(1);
				
		// Por meio de um predicado:
		list.removeIf(item -> item.charAt(0) == 'M');
		
		
		for(String item : list) {
			System.out.println(item);
		}
		
		
		System.out.println("--------------");
		
		// Encontrando a posição de um elemento da lista:
		System.out.println("Index of Bob: " + list.indexOf("Bob"));   // => 
		// Index of Bob: 1
		System.out.println("Index of Marco: " + list.indexOf("Marco")); // => -1
		// Observação: Quando o método indefOf() não encontra o elemento
		// na lista, ele retorna -1.
		
		System.out.println("--------------");
		
		// Filtrando os elementos com base num predicado:
		List<String> result = list.stream().filter(item -> item.charAt(0) == 'A').collect(Collectors.toList());
		for(String item : result) {
			System.out.println(item);
		}
		
		System.out.println("--------------");
		
		// Encontrando um elemento da lista que atenda a um predicado:
		String name = list.stream().filter(item -> item.charAt(0) == 'A').findFirst().orElse(null);
		
		System.out.println(name);  // => Alex
	}

}
