package fundamentos;

import java.util.Scanner;

public class Wrappers {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Byte b =100;
		Short s = 1000;
		Integer i = Integer.parseInt(entrada.next());// pegou o valor em String e converteu para int.
		Long l = 100000L;
		
		System.out.println(b.byteValue());//pega o valor de b.
		System.out.println(s.toString());//converteu o valor em Short para String.
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.564F;
		System.out.println(f);
		
		Double d = 124.457;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#';// char
		System.out.println(c + "...");
		
		entrada.close();
	}
}
