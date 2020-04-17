package oo.polimorfismo;

public class Jantar {
	
	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(99.55);
		
		Arroz ingrediente1 = new Arroz(0.15);
		 
		Feijao ingrediente2 = new Feijao(0.15);
		
		Sorvete sobreMesa = new Sorvete(0.30);
		
		Comida ingrediente4 = new Arroz(0.25);
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);
		convidado.comer(ingrediente4);
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(sobreMesa);
		System.out.println(convidado.getPeso());
		
		
		
		
	}

}
