package controle;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int numPrimo;
		int numeroDeDivisores = 0;

		System.out.println("Digite um número?");
		numPrimo = entrada.nextInt();
		for (int i = 1; i <= numPrimo; i++) {

			if (numPrimo % i == 0) {
				numeroDeDivisores++;
			}
		}
		if (numeroDeDivisores == 2) {
			System.out.println("O número digitado é primo!");
		} else {
			System.out.println("O número digitado não é primo! ");
		}
		entrada.close();
	}

}
