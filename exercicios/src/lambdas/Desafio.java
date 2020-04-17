package lambdas;

import java.util.function.UnaryOperator;

import java.util.function.Function;



public class Desafio {

	public static void main(String[] args) {

		/*
		 * 1.A partir do produto calcular o preço real (com desconto) 
		 * 2.Imposto
		 * municipal : >= 2500 (8,5%)/ < 2500 (Isento) 
		 * 3. Frete: >= 3000 (100)/ <
		 * 3000(50) 
		 * 4.Arrendodar: deixar duas casas decimais 
		 * 5.Formatar : R$ 1234,56
		 */

		Function<Produto, Double> precoFinal = 
				produto -> produto.preco * (1 - produto.desconto);
		UnaryOperator<Double> impostoMunicipal = 
				preco -> preco >= 2500 ? preco * 1.085 : preco;
		UnaryOperator<Double> frete = 
				preco -> preco >= 3000 ? preco + 100 : preco + 50;
		UnaryOperator<Double> arredondar =
				preco -> Double.parseDouble(String.format("%.2f" ,preco).replace(",","."));
		Function<Double, String> formatar = 
				preco -> ("R$ " + preco).replace(".",",");


				Produto pe1 = new Produto("ipad", 3235.89, 0.13);
				
		String preco = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(pe1);

		System.out.println("O preço final é: " + preco);

	}

}
