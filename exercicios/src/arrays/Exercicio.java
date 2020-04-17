package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {

		double[] notaAlunoA = new double[4];
		notaAlunoA[0] = 7.9;
		notaAlunoA[1] = 8;
		notaAlunoA[2] = 6.7;
		notaAlunoA[3] = 9.7;

		System.out.println(Arrays.toString(notaAlunoA));

		for (double notas1 : notaAlunoA) {

			System.out.print(notas1 + " ");
			notas1++;

		}
		System.out.println();

		double[] notasAlunoB = { 6.9, 8.9, 5.5, 10 };
		double totalAunoB = 0;

		for (int i = 0; i < notasAlunoB.length; i++) {

			totalAunoB += notasAlunoB[i];
		}

		System.out.println(totalAunoB / notasAlunoB.length);

	}
}
