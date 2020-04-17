package oo.composicao;

import java.util.ArrayList;

public class Compra {

	String clienteNome;
	ArrayList<Item> itens = new ArrayList<Item>();

	void adcionarItem(String nome, int quantidade, double preco) {
		adcionarItem1(new Item(nome, quantidade, preco));

	}

	void adcionarItem1(Item item) {
		this.itens.add(item);
		item.compra = this;

	}

	double obterValorTotal() {
		double total = 0;

		for (Item item : itens) {//aqui criamos um novo objeto q recebe itens!!!

			total += (item.quantidade * item.preco);// calculo da compra, soma total!! 

		}

		return total;// retorna o valor total da compra na variavel total!!!

	}

}
