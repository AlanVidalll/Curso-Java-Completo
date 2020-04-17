package controle;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int valor[] = new int[10];
		System.out.printf("Digite o valor 1: ");
		valor[0] = entrada.nextInt();

		for (int i = 1; i <= 9; i++) {

			System.out.printf("Digite o valor %d: ", i + 1);
			valor[i] = entrada.nextInt();

		}
		int maior = valor[0];
		for (int i = 1; i <= 9; i++) {
			if (valor[i] > maior) {
				maior = valor[i];
			}
		}
		System.out.println("O maior número encontrado é: " + maior);

		entrada.close();
	}

}
