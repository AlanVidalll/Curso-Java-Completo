package oo.abstrato;

public class TesteAbstrato {

	
	public static void main(String[] args) {
		
	Mamifero c1 = new Cachorro();
		
	
		
		System.out.println(c1.mamar());
		System.out.println(c1.mover());
		System.out.println(c1.respirar());
	}
}
