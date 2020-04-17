package streams;

import java.util.function.UnaryOperator;

public class Utilitario {
	
	public final static UnaryOperator<String> mauiscula = n -> n.toUpperCase();
	
	public final static UnaryOperator<String> primeiraletra = n -> n.charAt(0) + "";
	
	public final static String grito(String n){
		
		return  n + "!!! ";
	}  
	

}
