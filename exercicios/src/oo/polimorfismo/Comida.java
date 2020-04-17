package oo.polimorfismo;

public abstract class Comida {
	
private double peso;
	
	protected Comida(double peso){
		setPeso(peso);
	}

	protected double getPeso() {
		return peso;
	}

	protected void setPeso(double peso) {
		if(peso >= 0) {
			this.peso = peso;
			
		}
	}

}
