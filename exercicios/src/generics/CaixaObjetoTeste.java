package generics;

public class CaixaObjetoTeste {

	public static void main(String[] args) {

		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.3);// double => Double

		Double coisa = (Double) caixaA.abrir();
		System.out.println(coisa);

		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.guardar("Olá");// double => Double

		String coisa1 = (String) caixaB.abrir();
		System.out.println(coisa1);
	}
}
