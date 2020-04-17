package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2));

		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));// contatena as exclamação com o Boa tarde.
		System.out.println(s + "!!!"); // outra maneira de contatenar.
		System.out.println(s.startsWith("Boa"));// busca tudo que comeca com "Boa".
		
		// toLowerCase() inverte de minusculo pra maiusculoe busca o comecoda frase.
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));// busca o final da frase.
		System.out.println(s.length());// faz a contagem de caracteres.
		System.out.println(s.equals("boa tarde"));// comparaçao, verifica se igual por inteiro.
		System.out.println(s.equalsIgnoreCase("boa tarde"));// compara e ignora se minusculo ou maiscula.

		var nome = "pedro";
		var sobreNome = "santos";
		var idade = 25;
		var salario = 10214.987;

		System.out.println(
				"Nome: " + nome + "\nSobrenome :" + sobreNome 
				+ "\nIdade: " + idade + "\nSalario : " + salario);// um maneira de fazer.

		// outra maneira de fazer, similiar a linguagem C.
		System.out.printf("O senhor %s %s tem %d anos de idade e ganha R$ %.3f."
				,nome,sobreNome,idade,salario);
		
		/* aqui usamos o formato de cima e atribuimos a uma String usando String.format 
		e mandamos dar a saida com o que estava no conteudo frase.*/
		String frase = String.format("\nO senhor %s %s tem %d anos de idade e ganha R$ %.3f."
				,nome,sobreNome,idade,salario);
		System.out.println(frase);
		
		//.contains verifica se tem qual na frase e me um false ou true.
		System.out.println("Frase qualquer".contains("qual"));
		// indexOf mostra a partir de qual indice a palavra qual comeca.
		System.out.println("Frase qualquer".indexOf("qual"));
		// substring mostra a frase começando a partir do indice 6.
		System.out.println("Frase qualquer".substring(6));
		//aqui o substring com dois parametros mostra de qual indice comeca e qual termina.
		System.out.println("Frase qualquer".substring(6,8));

	}
}
