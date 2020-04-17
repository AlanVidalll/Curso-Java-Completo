package streams;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
	
	public static void main(String[] args) {
		
		DesafioProduto p1 = new DesafioProduto("Arroz", 11.00, 25, "Prato Fino");
		DesafioProduto p2 = new DesafioProduto("Feijão", 5.00, 50, "Broto Legal");
		DesafioProduto p3 = new DesafioProduto("Farofa", 3.50, 15, "Yoki");
		DesafioProduto p4 = new DesafioProduto("Macarrão", 4.80, 42, "Galo");
		DesafioProduto p5 = new DesafioProduto("Sal", 1.99, 62, "Lebre");
		DesafioProduto p6 = new DesafioProduto("Açucar", 8.75, 55, "Caravelas");
		
		
		List<DesafioProduto> produtos = Arrays.asList(p1,p2,p3,p4,p5,p6);
		
		Predicate<DesafioProduto> filtro1 = p -> p.preco >= 4.85 && p.preco <= 10.00;
		Predicate<DesafioProduto> filtro2 = p -> p.quantidade >= 20;
		Function<DesafioProduto, String> resultado = 
			p ->  p.nome + " R$ " + p.preco + "\nQuantidade: " + p.quantidade + "\n";
		
		produtos.stream()
		.filter(filtro1)
		.filter(filtro2)
		.map(resultado)
		.forEach(System.out::println);
		
		
	}

}
