package controle;

import java.util.Scanner;

public class WhileInderteminado {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	String valor = "";
	while(!valor.equalsIgnoreCase("sair")) {
		System.out.print("Voc� diz:");
		valor = entrada.nextLine();
	}
	
	
	entrada.close();
}
}
