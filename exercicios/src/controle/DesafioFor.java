package controle;

public class DesafioFor {

	public static void main(String[] args) {

		String valor = "#";
		char i = 'a';
		for (i = 'a'; i <= 'f'; i++) {
			System.out.println(valor);
			valor += "#";
		}

		// vers�o desafio
		// n�o pode usar valor num�rico para controlar o la�o

		for (String v = "#"; !v.equals("#######"); v += "#") {
			System.out.println(v);
		}
	}
}
