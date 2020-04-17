package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {

		// O "Print" ele somente imprimi e nao pula linha automatica
		// "Print" it only prints and does not skip automatic line
		System.out.print("Bom");
		System.out.print(" dia!!!\n\n");

		// O "Println ele pula uma linha automatica apos sua impresssao.
		// "Println" it skips an automatic line after your print.
		System.out.println("Bom");
		System.out.println("dia!!!");

		// O "Printf" tem a mesma sintaxe do linguagem C.
		// "Printf" has the same syntax as the C language.
		System.out.printf("Megasena: %d %d %d %d %d %d \n", 1, 2, 3, 4, 5, 6);
		System.out.printf("Salário: %.1f", 1234.5678);
		System.out.printf("\nNome: %s%n", "Rosana");// %n Quebra de linha // %n line jump

		// Scanner tem que importar, digite scanner e aperte Ctrl + espaço e importa o scanner java.util
		// Scanner has to import type scanner and press Ctrl + space and import java.util scanner
		Scanner entrada = new Scanner(System.in);// System.in e a leitura do teclado

		System.out.print("Digite seu nome:");
		String nome = entrada.nextLine();

		System.out.print("Digite seu sobrenome:");
		String sobreNome = entrada.nextLine();// nextLine faz a leitura em string.// nextLine reads string.

		System.out.println("Nome = " + nome + " " + sobreNome);

		System.out.print("Digite sua idade:");
		// aqui como e uma variavel int teremos que mudar nextLine para nexInt.
		// here as is a variable int we will have to change nextLine to nextInt.
		int idade = entrada.nextInt();
		System.out.println("Idade = " + idade);

		System.out.printf("%s %s tem %d anos.%n", nome, sobreNome, idade);

		// esse comando e pra fechar entrada, senão ele ficara averto e consumindo recursos da maquina.
		// this command and to close input, otherwise it will be open and consuming resources of the machine.
		entrada.close();
	}

}
