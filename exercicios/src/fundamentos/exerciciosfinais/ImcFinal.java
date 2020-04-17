package fundamentos.exerciciosfinais;

import java.util.Scanner;

public class ImcFinal {

	public static void main(String[] args) {

		// Criar um programa que leia o peso e a altura do usuário e imprima no console
		// o IMC.

		// Formula: IMC = 80 ÷ 1,802

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite seu peso?");
		String peso = entrada.next();
		System.out.println("Digite sua altura");
		String altura = entrada.next();

		float peso2 = Float.parseFloat(peso);
		float altura2 = Float.parseFloat(altura);

		float imc = peso2 / (altura2 * 2);

		System.out.printf("O IMC é: %.2f ", imc);

		entrada.close();

	}

}
