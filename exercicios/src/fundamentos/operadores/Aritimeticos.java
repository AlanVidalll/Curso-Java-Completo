package fundamentos.operadores;

public class Aritimeticos {
	public static void main(String[] args) {
		
		System.out.println(2 + 3);
		
		var x = 34.56; 
		double y = 2.2;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		int a = 8;
		int b = 3;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a / (double)b);// corverte inteiro para double e o resultado sai quebrado.
		System.out.println(a / (float)b);// corverte inteiro para float e o resultado sai quebrado.

		System.out.println(a % b); // % operador modulo, e o resto da divisao 
		System.out.println(8 % 3);
		
		System.out.println(x + y - a *b );
	}

}
