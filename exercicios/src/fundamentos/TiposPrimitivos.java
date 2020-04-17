package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informa�oes do Funcionario

		// tipos numericos inteiros

		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;// acrencenta L no final quando excede o tamanho literal

		// tipos numericos reais

		/*
		 * acrescenta F no final por � um literal e o float analisa o tipo e n�o o
		 * tamanho, entao se nao colocar ele vai enteder que erro , voce tem que indicar
		 * com F que voce quer um tipo double dentro do float
		 */
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;

		// tipos booleano

		boolean estaDeFerias = false; // true

		// tipo caractere

		char status = 'A'; // Ativo

		// dias de empresa do funcionario
		System.out.println(anosDeEmpresa * 365);

		// numero de viagens
		System.out.println(numeroDeVoos / 2);

		// pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("F�rias? " + estaDeFerias);
		System.out.println("Status : " + status);

	}
}
