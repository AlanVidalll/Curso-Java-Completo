package generics;

public class CaixaTeste {

	public static void main(String[] args) {

		Caixa<String> caixaA = new Caixa<>();
		caixaA.guardar("OLáaaaaa");// double => Double

		String coisaA = caixaA.abrir();
		System.out.println(coisaA);

		Caixa<Double> caixaB = new Caixa<>();
		caixaB.guardar(2.3);// double => Double

		Double coisaB = caixaB.abrir();
		System.out.println(coisaB);

	}
}