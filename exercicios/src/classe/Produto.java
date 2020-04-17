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
		// isso é um método do calculo de desconto
		return preco * (1 - desconto );

	}
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
		
		/* podemos ter um método com mesmo nome com identidades diferentes,
		 * o que define uma identidade são os tipos de parametros,
		 * se termos 2 metodos com paramêtros de tipos e quantidades iguais
		 * vai dar erro não pode, se a quantidade for igual e tipos diferente e possível 
		 * e se for tipos iguais e quantidades diferentes também e possível*/
	}

}
