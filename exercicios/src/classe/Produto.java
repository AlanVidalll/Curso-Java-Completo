package classe;

public class Produto {

	String nome;
	double preco;
	double desconto;
	
	Produto(){
		
	}
	
	Produto(String nomeInicial){
		nome = nomeInicial;
	}
	
	Produto(String nomeInicial,double precoInicial, double descontoInicial ){
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
	}
	

	double precoComDesconto() {
		// isso � um m�todo do calculo de desconto
		return preco * (1 - desconto );

	}
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
		
		/* podemos ter um m�todo com mesmo nome com identidades diferentes,
		 * o que define uma identidade s�o os tipos de parametros,
		 * se termos 2 metodos com param�tros de tipos e quantidades iguais
		 * vai dar erro n�o pode, se a quantidade for igual e tipos diferente e poss�vel 
		 * e se for tipos iguais e quantidades diferentes tamb�m e poss�vel*/
	}

}
