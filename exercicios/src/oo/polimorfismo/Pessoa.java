package oo.polimorfismo;

public class Pessoa {

	private double peso;

	protected Pessoa(double peso) {
		setPeso(peso);
	}

	protected void comer(Comida comida) {

		this.peso += comida.getPeso();

	}

	

	protected double getPeso() {
		return peso;
	}

	protected void setPeso(double peso) {
		if (peso >= 0) {
			this.peso = peso;

		}
	}

}
