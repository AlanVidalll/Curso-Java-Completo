package controle;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		int soma = 0;
		while (numero >= 0) {

			System.out.println("Digite um numero positivo para se somar ou negativo pra encerrar!");
			numero = entrada.nextInt();
			if (numero >= 0) {
				soma += numero;
				System.out.println("At� o momento a soma �: "+ soma);
			}
		}
		System.out.println("A soma dos n�meros positivos s�o: " + soma);
		entrada.close();
	}
}
