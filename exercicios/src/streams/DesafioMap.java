package streams;

import java.util.Arrays; 
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;



public class DesafioMap {
	
	public static void main(String[] args) {
		
	
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		/*
		 * 1. Número para String binária... 6=> "110"
		 * 2.Inverter a String... "110" => "011"
		 * 3.Converter de volta paraa inteiro => "011" => 11
		 * */
		
	    UnaryOperator<String> inverter = 
	    			texto -> new StringBuilder(texto).reverse().toString();
	    			
	    			Function<String, Integer>binarioParaInteiro = 
	    					texto -> Integer.parseInt(texto,2);
		
		nums.stream()
		.map(Integer::toBinaryString)
		.map(inverter)
		.map(binarioParaInteiro)
		.forEach(System.out::println);
	
	}
}