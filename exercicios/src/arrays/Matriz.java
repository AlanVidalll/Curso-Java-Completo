package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a quantidade de alunos na turma?");
		int alunos = entrada.nextInt();

		System.out.println("Digite a quantidade de notas de cada aluno por ano?");
		int notas = entrada.nextInt();

		double[][] matriz = new double[alunos][notas];

		double total = 0;
		for (int i = 0; i < matriz.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf("Digite a nota %d do aluno %d: ", j + 1, i + 1);
				matriz[i][j] = entrada.nextDouble();
				total += matriz[i][j];
			}
		}
		System.out.println();

		for (double[] notasdoAlunos : matriz) {
			System.out.println(Arrays.toString(notasdoAlunos));
		}
		System.out.println();

		double media = total / (alunos * notas);
		System.out.printf("A media da sala é: %.2f", media);

		entrada.close();

	}

}
