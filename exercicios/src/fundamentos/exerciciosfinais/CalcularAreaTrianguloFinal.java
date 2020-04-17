package fundamentos.exerciciosfinais;

import java.util.Scanner;

public class CalcularAreaTrianguloFinal {
	
	public static void main(String[] args) {
		
		//Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
		
		//Formula are = (base * altura) / 2.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a medida da base do triângulo?");
		double base = entrada.nextDouble();
		System.out.println("Digite a altura do triângulo?");
		double altura = entrada.nextDouble();
		
		double area = (base * altura) / 2;
		
		System.out.println("A área do triângulo é: " + area);
		
		entrada.close();
		
	}

}
