package generics;

public class CaixaNumeroTeste {
	
	public static void main(String[] args) {
		
		CaixaNumero<Double> caixaA = new CaixaNumero<Double>();
		caixaA.guardar(25.2);
		
		Double coisaA = caixaA.abrir();
		System.out.println(coisaA);
		
		CaixaNumero<Integer> caixaB = new CaixaNumero<Integer>();
		caixaB.guardar(25);
		
		Integer coisaB = caixaB.abrir();
		System.out.println(coisaB);
	}

}
