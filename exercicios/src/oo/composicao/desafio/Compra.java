package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	 final List<Item1> itens = new ArrayList<>();

	void adicionarItem(Produto p1, int qtde1) {

		this.itens.add(new Item1(p1, qtde1));

	}
	
	void adicionarItem(String nome,double preco,int qtde1) {
		var produto = new Produto(nome, preco);
		this.itens.add(new Item1(produto, qtde1));
		
	}
	
	

	double obterValorTotal() {
		double total = 0;
		for (Item1 item : itens) {

			total += item.quantidade * item.produto.preco;
		}
		return total;

	}
}
