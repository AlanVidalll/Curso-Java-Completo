package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();

		// offer e add => Adicionam elementos na fila.
		// Diferença é o comportamento quando a fila está cheia.

		fila.add("Ana"); // retorna false.
		fila.offer("Bia");// lança uma exceção.
		fila.add("Carlos");
		fila.offer("Alan");
		fila.add("Bruna");
		fila.offer("Gui");

		// peek e element => obter o próximo elemento na fila.(sem remover)
		// Diferença é o comportamento quando a fila está vazia.
		System.out.println(fila.peek()); // retorna false.
		System.out.println(fila.peek());
		System.out.println(fila.element()); // lança exceção.
		System.out.println(fila.element());


		// poll e remove => obter o próximo elemento na fila e remove.
		// Diferença é o comportamento quando a fila está vazia.
		System.out.println(fila.poll());// retorna null.
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());// retorna uma exceção.

		// fila.size();
		// fila.clear();
		// fila.inEmpty();
		//fila.contains();
	}
}
