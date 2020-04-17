package classe;

public class Desconto {
	
	
	String nome;
	static double desc = 0.25;
	double preco;
	
	
	Desconto(String nomeInicial, double precoInicial){
		
	nome = nomeInicial;
	preco = precoInicial;
		
	}
	
	double desconto() {
		
		return preco * (1 - desc);
		
	}

}
