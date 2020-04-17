package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String texto = "";

		do {
			System.out.println("Você precisa falar as palavras magicas...");
			System.out.println("quer sair?");
			texto = entrada.nextLine();

		} while (!texto.equalsIgnoreCase("Por favor"));
		System.out.println("Obrigado!...");
		entrada.close();

	}
}
