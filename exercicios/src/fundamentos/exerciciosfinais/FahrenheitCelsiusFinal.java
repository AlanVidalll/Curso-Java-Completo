package fundamentos.exerciciosfinais;

import java.util.Scanner;

public class FahrenheitCelsiusFinal {

	public static void main(String[] args) {

		// Criar um programa que leia a temperatura em Fahrenheit e converta para
		// Celsius.

		// Formula : °C = (°F − 32) ÷ 1, 8

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a tempereatura em fahrenheit?");
		String fahrenheint = entrada.next();
		System.out.println(fahrenheint + "°");
		double conversao = Double.parseDouble(fahrenheint);
		double resultado = conversao - 32 / 1.8;
		System.out.printf("O resultado em celsius é: %.2f°", resultado);
		entrada.close();
	}

}
