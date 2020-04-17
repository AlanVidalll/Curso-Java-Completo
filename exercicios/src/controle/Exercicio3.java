package controle;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double media = 0;
		double nota1 = 0;
		double nota2 = 0;

		for (int i = 1; i <= 1; i++) {

			System.out.println("Digite a nota 1");
			nota1 = entrada.nextDouble();
			System.out.println("Digite a nota 2");
			nota2 = entrada.nextDouble();
		}

		entrada.close();

		media = (nota1 + nota2) / 2;
		System.out.println();

		if (media >= 7 && media <= 10) {
			System.out.println("Sua nota foi " + media + " Aprovado!!!");
		} else if (media < 7 && media >= 4) {
			System.out.println("Sua nota foi " + media + " Recuperação!!!");
		} else if (media >= 0 && media < 4) {
			System.out.println("Sua nota foi " + media + " Reprovado");
		} else {
			System.out.println("Notas digitadas inválidas!");
		}
	}
}
