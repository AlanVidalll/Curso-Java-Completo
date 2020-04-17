package classe;

public class AreaCircTeste {

	public static void main(String[] args) {

		AreaCirc a1 = new AreaCirc(10);

		

		AreaCirc.pi = 3.1415; // pi esta associado a classe, pois esta no static.
		/*
		 * nesse caso você pode alterar o valor de pi acessando ele da classe e nao da
		 * instância se você acrescentar o final após o static a variavel pi não podera
		 * ser alterada ,assim se tornando uma constante. EXEMPLO: static final double
		 * PI = 3.14; por convenção da linguagem constantes se escreve com o nome com
		 * letra maiusculas conforme exemplo abaixo
		 */
		System.out.println(a1.area());
		System.out.println(AreaCirc.area(100));
		AreaCirc.pi = 1;

	}
}
