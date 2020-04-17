package pratica;

import java.util.Scanner;

public class CalculoSalario {

	public static void main(String[] args) {

		String nome;
		double salarioHora;
		int horasTrabalhadas;
		double salarioBruto;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o nome do funcionário?");
		nome = entrada.nextLine();
		System.out.println("Digite o valor do sálario hora?");
		salarioHora = entrada.nextDouble();
		System.out.println("Digite o numero de horas trabalhada?");
		horasTrabalhadas = entrada.nextInt();

		entrada.close();

		salarioBruto = horasTrabalhadas * salarioHora;

		if (salarioBruto >= 0 && salarioBruto <= 1830) {
			salarioBruto = salarioBruto - (salarioBruto * 8.0) / 100;
		} else if (salarioBruto > 1830 && salarioBruto <= 3050) {
			salarioBruto = salarioBruto - (salarioBruto * 9.0) / 100;
		} else if (salarioBruto > 3050 && salarioBruto <= 6101) {
			salarioBruto = salarioBruto - (salarioBruto * 11.0) / 100;
		} else {
			salarioBruto = salarioBruto - (6101 * 11.0) / 100;
		}

		System.out.println(nome);
		System.out.println("Salario hora é R$ " + salarioHora);
		System.out.println("Horas trabalhadas no mês é R$ " + horasTrabalhadas);
		System.out.println("Salário líquido é R$ " + salarioBruto);
	}
}
