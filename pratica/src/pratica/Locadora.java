package pratica;

import java.util.Scanner;

public class Locadora {

	public static void main(String[] args) {

		int filmes;
		double faturamentoAnual;
		double valorLocacao = 5.00;
		double multas;
		double depreciacao;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a quantidade de filmes tem na sua locadora?");
		filmes = entrada.nextInt();
		entrada.close();

		faturamentoAnual = ((filmes / 3) * valorLocacao) * 12;
		multas = ((filmes / 3) / 10) * (valorLocacao * 0.10);
		depreciacao = (filmes - filmes * 0.02) + filmes / 10;
		int final1 = (int) depreciacao;

		faturamentoAnual = faturamentoAnual + (multas * 12);

		System.out.println("Faturamento anualcom alugueis \ne multas foi R$ " + faturamentoAnual);
		System.out.println("Valor de multas por atraso no mês \nR$ " + multas);
		System.out.println("Total de filmes no final do ano: " + final1);

	}

}
