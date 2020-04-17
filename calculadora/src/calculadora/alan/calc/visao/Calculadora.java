package calculadora.alan.calc.visao;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculadora extends JFrame {

	public Calculadora() {

		organizarLayout();
		setSize(320, 450);
		// Tamanho da tela!
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// Encerra a apçlicaçao assim que fecha a tela!
		setLocationRelativeTo(null);
		// Faz a tela abrir no centro do monitor!
		setVisible(true);
		/*
		 * Torna a tela visivel assim que inicia a aplicação, se for false a tela não
		 * aparece!
		 */
	}

	private void organizarLayout() {
		setLayout(new BorderLayout());

		Display display = new Display();
		display.setPreferredSize(new Dimension(301, 75));
		add(display, BorderLayout.NORTH);

		Teclado teclado = new Teclado();
		add(teclado, BorderLayout.CENTER);

	}

	public static void main(String[] args) {
		new Calculadora();
	}
}
