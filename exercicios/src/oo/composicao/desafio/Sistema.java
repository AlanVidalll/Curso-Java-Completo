package oo.composicao.desafio;

public class Sistema {

	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Maria Joana");
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("caneta", 2.50,5);
		compra1.adicionarItem(new Produto("Lapis",1.5),5);
		
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("estojo", 10,5);
		compra1.adicionarItem(new Produto("estojo",15),5);
		
		cliente.adicionarCompra(compra1);
		cliente.compras.add(compra2);
		
		
		System.out.println(cliente.obterValorTotal());
		
	}
}
