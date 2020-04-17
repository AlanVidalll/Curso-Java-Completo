package classe;

public class AreaCirc {

	double raio;
	static double pi = 3.14;

	AreaCirc(double raioInicial) { // Construtor.
		
		raio = raioInicial;

	}

	double area() {// Metodo.

		return pi * Math.pow(raio, 2);
	}
	
	 static double area(double raio) {
		
		return pi * Math.pow(raio, 2);
	}
}
