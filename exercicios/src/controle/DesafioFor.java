package controle;

public class DesafioFor {

	public static void main(String[] args) {

		String valor = "#";
		char i = 'a';
		for (i = 'a'; i <= 'f'; i++) {
			System.out.println(valor);
			valor += "#";
		}

		// versão desafio
		// não pode usar valor numérico para controlar o laço

		for (String v = "#"; !v.equals("#######"); v += "#") {
			System.out.println(v);
		}
	}
}
