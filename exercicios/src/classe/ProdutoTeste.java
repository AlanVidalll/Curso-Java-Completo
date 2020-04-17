package classe;

public class ProdutoTeste {

	public static void main(String[] args) {

		Produto p1 = new Produto("ferrari", 2450.00, 0.25);

		Produto p2 = new Produto();
		p2.nome = "Lamborguini";
		p2.preco = 3500.00;
		p2.desconto = 0.30;

		System.out.println(p1.nome);
		System.out.println(p2.nome);

		double precoFinal1 = p1.precoComDesconto(0);// Chama o metodo e faz o calculo.
		double precoFinal2 = p1.precoComDesconto(0.1);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

		System.out.printf("Média do carrinho é: R$ %.2f.", mediaCarrinho);

	}

}
