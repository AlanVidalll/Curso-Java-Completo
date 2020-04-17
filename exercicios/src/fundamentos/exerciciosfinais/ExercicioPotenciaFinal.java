package fundamentos.exerciciosfinais;

import java.util.Scanner;

public class ExercicioPotenciaFinal {
	public static void main(String[] args) {
		
		//Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite o valor a ser elevado ao quadrado?");
		double num1 = entrada.nextDouble();
		
		double quadrado = Math.pow(num1, 2);
		double cubo = Math.pow(num1, 3);
		
		System.out.println("O valor ao quadrado é: "+ quadrado + " e o valor ao cubo é: " + cubo + ".");
		
		
	
		entrada.close();
		
		
	}

}
