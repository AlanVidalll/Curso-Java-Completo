package arrays;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int a = 0;

		System.out.println("Digite a quantidade de notas?");
		a = entrada.nextInt();

		double[] notaAluno = new double[a];

		for (int i = 0; i < notaAluno.length; i++) {

			System.out.printf("Informe a %d nota?", i + 1);
			notaAluno[i] = entrada.nextDouble();

		}
		System.out.println();
		
	
		
		double total = 0;
		for (double notas1 : notaAluno) {
			total += notas1;

		}
		
		System.out.println("A média é: " + total / notaAluno.length);
		entrada.close();

	}

}
