package fundamentos.operadores;

public class Unarios {
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1;
		a--; // a = a - 1;
		
		++b; // b = b + 1;
		--b; // b = b - 1;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println("Mini Desafio...");
//operador antes ele incrementa antes da coparaçao e depois ele compara primeiro e depois incrementa.
		System.out.println(++a == b--);
		System.out.println(a);
		System.out.println(b);

	}

}
