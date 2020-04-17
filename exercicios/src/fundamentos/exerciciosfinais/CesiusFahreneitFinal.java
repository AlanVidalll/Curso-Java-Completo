package fundamentos.exerciciosfinais;

import java.util.Scanner;

public class CesiusFahreneitFinal {
	public static void main(String[] args) {
		
		//Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
		
		//Formula: °F = °C × 1, 8 + 32
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual a temperatura em Fahrenheit?");
		String celsius = entrada.next();
		
		double conversao = Double.parseDouble(celsius);
		System.out.println(celsius + "°");
		double resultado = (conversao * 1.8) + 32;
		System.out.println(   "A temperatura em fahrenheit é: " + resultado + "°");
		entrada.close();
	}

}

