package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {

		// Set<String> ListaAprovados = new HashSet<>();//Esse n�o respeita a ordem de
		// inser��o.
		SortedSet<String> ListaAprovados = new TreeSet<>();// esse respeita a ordem de inser��o.
		ListaAprovados.add("Alan");
		ListaAprovados.add("carlos");
		ListaAprovados.add("ana");
		ListaAprovados.add("maria");

		for (String candidatos : ListaAprovados) {

			System.out.println(candidatos);
		}

		Set<Integer> nums = new HashSet<>();// Esse n�o respeita a ordem de inser��o.
		nums.add(1);
		nums.add(5);
		nums.add(120);
		nums.add(12);
		
		for (int numeros : nums) {

			System.out.println(numeros);
		}

	}
}
