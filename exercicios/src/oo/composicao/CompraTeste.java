package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		Compra compra1 = new Compra();// criamos uma nova compra!
		compra1.clienteNome = "Jo�o"; // Chmamamos o cliente da compra 1 e add um nome
		compra1.adcionarItem("teclado", 2, 15.00);
		compra1.adcionarItem("mouse", 2, 8.50);
		compra1.adcionarItem("fone", 1, 5.52);/* Aqui chamamos a compra1 e add itens
		foi criado um construtor e um metodo de nova inst�ncia que chama tudo, entao
		chama- se a compra 1 e mais o metodo adicionaItem() */
		
		System.out.println(compra1.itens.size());
		// .size printa quantidade de itens diferentes , e nao a quantidade de cada um.
		
		System.out.printf("%.2f\n",compra1.obterValorTotal());/*foi criado um metodo
		 para obter o valor da compra assim chamamos a compra seguido do metodo*/ 
		
		double total = compra1.itens.get(0).
				compra.itens.get(0).compra.itens.get(1).
				compra.obterValorTotal();// s� para mostra a rela��o bidirecional!!!
		
		System.out.printf("O total � R$ %.2f",total);
	}

}
