package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		/*
		 * o usuario tem q digitar a nota somar as notas na variavel total e somar a
		 * quantidas de notas que foram digitadas calcular a media, o usuario finaliza o
		 * loop digitando -1
		 */

		Scanner entrada = new Scanner(System.in);

		int contador = 0;
		String nota1 = "";
		double nota = 0;
		double nota2 = 0;

		while (nota != -1) {

			System.out.println("Digite a nota?");
			nota1 = entrada.next().replace(",",".");
			nota = Double.parseDouble(nota1);
			if (nota >= 0 && nota <= 10) {
				nota2 += nota;
				contador++;
			} else {
				System.out.println("Digite uma nota valida de 0 a 10 ou \n" 
			+ "(-1) para finalizar o calculo!");
			}

		}
		double media = nota2 / contador;
		System.out.printf("Média da nota é: %.2f ", media);

		entrada.close();

	}
}
