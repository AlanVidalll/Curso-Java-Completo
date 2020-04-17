package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
	
	public static void main(String[] args) {
		 
		List<String> langs = Arrays.asList("alan","vidal","Fonseca","junior") ;
		List<Integer> langs1 = Arrays.asList(12,25,14,78);
		
		String ultimaLinguagem = (String)ListaUtil.getUltimo1(langs);
		System.out.println(ultimaLinguagem);
		
		Integer numeroInt =(Integer)ListaUtil.getUltimo1(langs1);
		System.out.println(numeroInt);
		
		String ultimaLinguagem1 = ListaUtil.getUltimo2(langs);
		System.out.println(ultimaLinguagem1);
		
		Integer numeroInt1 = ListaUtil.getUltimo2(langs1);
		System.out.println(numeroInt1);
		
		

}
}