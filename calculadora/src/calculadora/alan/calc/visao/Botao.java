package calculadora.alan.calc.visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Botao extends JButton {

	public Botao(String texto, Color cor) {

		setText(texto);// texto do bot�o!
		setFont(new Font("courier", Font.PLAIN, 25));
		// Fonte,estilo e tamnho da fonte do texto dos bot�es!
		setOpaque(true);
		setBackground(cor);// Define a cor do fundo do bot�o!
		setForeground(Color.WHITE);// Define a cor do texto do bot�o!
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		// Define a cor da borda do bot�o
	}
}
