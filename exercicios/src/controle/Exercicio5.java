package controle;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número?");
		int numero = entrada.nextInt();
		int divisores = 0;
		String resultado = "";
		for (int i = 1; i <= numero; i++) {

			if (numero % i == 0) {
				divisores++;
			}
		}

		switch (divisores) {
		case 2:
			resultado = ("O número digitado  é primo! ");
			break;

		default:
			resultado = "Não é primo";

		}
		
		System.out.println(resultado);

		entrada.close();

	}
}
