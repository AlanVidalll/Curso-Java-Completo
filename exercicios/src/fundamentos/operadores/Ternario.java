package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		
		
		double media = 3.5;
		 
		String resultadoFinal = media>= 7.0 ? "aprovado" : "em recuperação";
		System.out.println("O aluno está: " + resultadoFinal);
		
		double nota =  9.5;
		boolean bomComportamento = true;
		boolean  passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim" : "Não";
		
		System.out.println("Tem desconto? " + resultado);

	}
}
