package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	public static void main(String[] args) {
		
		List<Usuario> lista = new ArrayList<>();
		
		
		Usuario u1 = new Usuario("alan");
		
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Ana"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Monica"));
		lista.add(new Usuario("Messi"));
		lista.add(new Usuario("Messi"));
		
		System.out.println(lista.get(3));// acessar pelo indice.

		System.out.println(lista.remove(1)+ " fui removido");
		System.out.println(lista.remove(new Usuario("Ana")));
		
		System.out.println("Tem? "+lista.contains(new Usuario("Messi")));
		for(Usuario lista1 : lista ) {

			System.out.println(lista1);

		
	}}

}
