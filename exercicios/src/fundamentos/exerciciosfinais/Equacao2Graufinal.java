package fundamentos.exerciciosfinais;

import java.util.Scanner;

public class Equacao2Graufinal {

	public static void main(String[] args) {

		/*
		 * Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0)
		 * utilizando a fórmula de Bhaskara. Use como exemplo a = 1, b = 12 e c = -13.
		 * Encontre o delta
		 */

		// Formula delta: B² - 4.a.c

		// Formula de Baskara: (-b +- raiz de delta) / 2.a

		Scanner entrada = new Scanner(System.in);

		System.out.println("Equação do 2° grau: Ax² + Bx + C = 0");

		System.out.println("Digite o valor de A?");
		double a = entrada.nextDouble();
		System.out.println("Digite o valor de B?");
		double b = entrada.nextDouble();
		System.out.println("Digite o valor de C?");
		double c = entrada.nextDouble();

		double delta = Math.pow(b, 2) - 4 * a * c;//Math.pow(b, 2) calcula a potencia b e o valor e 2 unumero elevado.
		System.out.println("Delta = " + delta);

		double raiz = Math.sqrt(delta);//Math.sqrt(delta) essa função calcula a raiz quadrada.

		System.out.println(raiz);
		double x1 = (-b + raiz) / (2 * 1);

		double x2 = (-b - raiz) / (2 * 1);

		System.out.printf("X1 = %.2f e X2 = %.2f ", x1, x2);

		entrada.close();

	}

}
