package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {

		/*digite syos e aperte  Ctrl + espaço e  
		preenche automatico o comando de saida de dados que vai ser =  System.out.println();*/

		double raio = 3.4;
		//final antes da variavel transforma ela em constante e não pode ser alterada
		final double PI = 3.14159; 
		double area = PI * raio * raio;
		System.out.println(area);
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Area = " + area +"m2.");


	}
}
