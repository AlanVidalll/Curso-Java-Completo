package calculadora.alan.calc.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;


import javax.swing.JLabel;
import javax.swing.JPanel;

import calculadora.alan.calc.modelo.Memoria;
import calculadora.alan.calc.modelo.MemoriaObservador;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador {

	private final JLabel label;

	public Display() {
		
		Memoria.getInstancia().adicionarObservador(this);
		setBackground(new Color(46, 49, 50));// Cor de fundo do display!
		label = new JLabel(Memoria.getInstancia().getTextoAtual());
		// colocou uma label com texto!
		label.setForeground(Color.WHITE);// cor do texto da label e branca!
		label.setFont(new Font("courier", Font.PLAIN, 35));
		// Determinando nome, estilo e tamanho da fonte do label!
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25));
		// Centraliza o label na direita e regula os espaçmentos horizontal e vertical!

		add(label);// add a label no dysplay!
	}
	@Override
	public void valorAlterado(String novoValor) {
		label.setText(novoValor);
		
	}

}
