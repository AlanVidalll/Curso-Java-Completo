package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a m�dia:");
		double media = entrada.nextDouble();

		if (media <= 10.0 && media >= 7.0) {
			System.out.println("Parab�ns voc� foi aprovado!");
		}

		if (media < 7.0 && media >= 4.5) {
			System.out.println("Que pena voc� est� de recupera��o!");
		}
		
		if(media < 4.5 && media >= 0 ) {
			System.out.println("Que decep��o voc� foi reprovado!");
		}

		entrada.close();

	}

}
