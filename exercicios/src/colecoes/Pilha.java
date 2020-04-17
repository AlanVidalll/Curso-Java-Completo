package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {

		Deque<String> livros = new ArrayDeque<>();

		livros.add("O Pequeno principe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");

		System.out.println(livros.peek());
		System.out.println(livros.element());
		System.out.println();

		//System.out.println(livros.poll());
		//System.out.println(livros.poll());
		//System.out.println(livros.poll());
		//System.out.println(livros.poll());
		//System.out.println(livros.remove());
		//System.out.println(livros.pop()); // pop t�mbem retorna uma exece��o;
		
		//livros.size();
		//livros.clear();
		//livros.contains();
		//livros.isEmpty();
		
		for(String livro : livros) {
			
			System.out.println(livro);
		}

	}

}
