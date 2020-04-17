package classe;

public class DesafioClasseJantar {

	
	public static void main(String[] args) {
		
		
		DesafioClasseComida c1 = new DesafioClasseComida("Marmitex", 0.750);
		DesafioClasseComida c2 = new DesafioClasseComida("X-Tudo", 0.450);
		
		DesafioClassePessoa p1 = new DesafioClassePessoa("Alan",83.3);
		System.out.println(p1.apresentar());
		p1.comer(c1);
		System.out.println(p1.apresentar());
		
		System.out.println();
		
		DesafioClassePessoa p2 = new DesafioClassePessoa("jessica",62.7);
		System.out.println(p2.apresentar());
		p2.comer(c2);
		System.out.println(p2.apresentar());
		
		
		
		
		
		
	}
}
