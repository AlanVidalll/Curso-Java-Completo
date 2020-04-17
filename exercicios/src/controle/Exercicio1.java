package controle;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o número?");
		int numero = entrada.nextInt();

		if (numero >= 0 && numero <= 10 && numero % 2 == 0) {

			System.out.println("O número está entre 0 e 10 e támbem e par: " + numero);
		} else {
			System.out.println("O numero não está entre 0 e 10 ou é impar: " + numero);
		}

		entrada.close();
	}
}
