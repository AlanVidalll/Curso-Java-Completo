package controle;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um n�mero?");
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
			resultado = ("O n�mero digitado  � primo! ");
			break;

		default:
			resultado = "N�o � primo";

		}
		
		System.out.println(resultado);

		entrada.close();

	}
}
