package controle;


import javax.swing.JOptionPane;

public class DesafioDiaSemana {
	public static void main(String[] args) {

		String dia = JOptionPane.showInputDialog("Informe o dia");

		if (dia.equalsIgnoreCase("domingo")) {
			System.out.println("Dia 1!");
		} else if (dia.equalsIgnoreCase("segunda")) {
			System.out.println("Dia 2!");
		} else if (dia.equalsIgnoreCase("terça")) {
			System.out.println("Dia 3!");
		} else if (dia.equalsIgnoreCase("quarta")) {
			System.out.println("Dia 4!");
		} else if (dia.equalsIgnoreCase("quinta")) {
			System.out.println("Dia 5!");
		} else if (dia.equalsIgnoreCase("sexta")) {
			System.out.println("Dia 6!");
		} else if (dia.equalsIgnoreCase("sabado")) {
			System.out.println("Dia 7!");
		} else {
			System.out.println("Dia inválido!!!");
		}

	}
}
