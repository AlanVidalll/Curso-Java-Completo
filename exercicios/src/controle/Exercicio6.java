package controle;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		int numero = 21;
		int contador = 10;
		Scanner entrada = new Scanner(System.in);

		for (contador = 9; contador >= 0; contador--) {
			
			System.out.println("Digite o numero da sorte?");
			int sorte = entrada.nextInt();

			if (sorte > numero) {
				System.out.printf("Errou, voc� tem mais %d de chance!\n", contador);
				System.out.println();
				System.out.println("O numero digitado e maior que o n�mero premiado\n");

			} else if (sorte < numero) {
				System.out.printf("Errou, voc� tem mais %d de chance!\n", contador);
				System.out.println();
				System.out.println("O numero digitado e menor que o n�mero premiado\n");

			} else {
				System.out.println("Parab�ns, voc� ganhou uma ferrari!!!");
				break;
			}
          
		}

		entrada.close();

	}
}
