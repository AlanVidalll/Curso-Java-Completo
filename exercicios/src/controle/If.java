package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a média:");
		double media = entrada.nextDouble();

		if (media <= 10.0 && media >= 7.0) {
			System.out.println("Parabéns você foi aprovado!");
		}

		if (media < 7.0 && media >= 4.5) {
			System.out.println("Que pena você está de recuperação!");
		}
		
		if(media < 4.5 && media >= 0 ) {
			System.out.println("Que decepção você foi reprovado!");
		}

		entrada.close();

	}

}
