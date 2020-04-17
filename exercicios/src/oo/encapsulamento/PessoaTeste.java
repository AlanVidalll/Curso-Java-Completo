package oo.encapsulamento;

public class PessoaTeste {
	
	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Alan","Vidal",-45);
		p1.setIdade(230);//alterar valor
		
		System.out.println(p1.getNomeCompleto()); // ler valor
	
		
	}
}
