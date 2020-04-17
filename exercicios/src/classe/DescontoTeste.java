package classe;

public class DescontoTeste {
	
	public static void main(String[] args) {
		
		
		Desconto p1 = new Desconto("Detergente",25.00);
		
		System.out.printf("Nome: %s\nPreço: %.2f\nDesconto: %.2f\n\n",p1.nome , p1.preco, p1.desconto());
		
		Desconto.desc = 0;
		
		System.out.printf("Nome: %s\nPreço: %.2f\nDesconto: %.2f",p1.nome , p1.preco, p1.desconto());
		
		
	}

}
