package fundamentos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		String num1 = JOptionPane.showInputDialog("Digite o primeiro número:").replace(",", ".");
		String num2 = JOptionPane.showInputDialog("Digite o segundo número:").replace(",", ".");
		String operacao = JOptionPane.showInputDialog("Digite a operação:");
		
		double numero1 = Double.parseDouble(num1);
		double numero2 = Double.parseDouble(num2); 
	 
		
		
		double resultado = "+".contentEquals(operacao) ? numero1 + numero2 : 0;
		 resultado = "-".contentEquals(operacao) ? numero1 - numero2 : resultado;
		 resultado = "*".contentEquals(operacao) ? numero1 * numero2 : resultado;
		 resultado = "/".contentEquals(operacao) ? numero1 / numero2 : resultado;
		 resultado = "%".contentEquals(operacao) ? numero1 % numero2 : resultado;
		System.out.printf("%.2f %s %.2f = %.2f",numero1,operacao,numero2,resultado);
		
		
	
		
		entrada.close();
	}

}
