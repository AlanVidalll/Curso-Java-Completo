package controle;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o n�mero?");
		int numero = entrada.nextInt();

		if (numero >= 0 && numero <= 10 && numero % 2 == 0) {

			System.out.println("O n�mero est� entre 0 e 10 e t�mbem e par: " + numero);
		} else {
			System.out.println("O numero n�o est� entre 0 e 10 ou � impar: " + numero);
		}

		entrada.close();
	}
}
