package excecao;

public class Basico {

	public static void main(String[] args) {

		Aluno a1 = null;
		
		try {
			imprimirNomeAluno(a1);
		} catch (Exception excecao) {
			System.out.println("Ocorreu um erro na impresão do nome!");
		}

		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) {
			System.out.println("Ocorreu um erro: " + e.getMessage());
		}

		System.out.println("Fim :");
	}

	public static void imprimirNomeAluno(Aluno aluno) {

		System.out.println(aluno.nome);
	}

}
