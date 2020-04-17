package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();

		// offer e add => Adicionam elementos na fila.
		// Diferen�a � o comportamento quando a fila est� cheia.

		fila.add("Ana"); // retorna false.
		fila.offer("Bia");// lan�a uma exce��o.
		fila.add("Carlos");
		fila.offer("Alan");
		fila.add("Bruna");
		fila.offer("Gui");

		// peek e element => obter o pr�ximo elemento na fila.(sem remover)
		// Diferen�a � o comportamento quando a fila est� vazia.
		System.out.println(fila.peek()); // retorna false.
		System.out.println(fila.peek());
		System.out.println(fila.element()); // lan�a exce��o.
		System.out.println(fila.element());


		// poll e remove => obter o pr�ximo elemento na fila e remove.
		// Diferen�a � o comportamento quando a fila est� vazia.
		System.out.println(fila.poll());// retorna null.
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());// retorna uma exce��o.

		// fila.size();
		// fila.clear();
		// fila.inEmpty();
		//fila.contains();
	}
}
