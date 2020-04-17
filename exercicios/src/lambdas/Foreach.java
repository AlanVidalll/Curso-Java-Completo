package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana","Bia","Lia", "Gui");
		
		System.out.println("Form tradicional....");
		for(String nome : aprovados) {
			
			System.out.println(nome);
		}
		System.out.println("\nLambda #01.....");
		aprovados.forEach((nome) -> {System.out.println(nome + "!!!");});
		/*aqui a variavael nome esta entre paraenteses, 
		 * n�o precisaria para uma parametro somente, 
		 * a senten�a de c�digo esta entre chaves, 
		 * n�o precisaria tambem como exemplo abaixo , 
		 * mais do que uma teria necessidade */
		
		
		System.out.println("\nLambda #02.....");
		aprovados.forEach(nome -> System.out.println(nome + "!!!"));
		
		System.out.println("\nMethod Reference ");
		aprovados.forEach(System.out::println);
		
		System.out.println("\nLambda #02.....");
		aprovados.forEach(nome -> meuImprimir(nome));
		
		
		System.out.println("\nMethod Reference ");
		aprovados.forEach(Foreach :: meuImprimir);
	}
	
	static void meuImprimir(String nome) {
		System.out.println("Oi meu nome � : " + nome);
	}

}
