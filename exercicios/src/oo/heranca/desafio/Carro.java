package oo.heranca.desafio;

public class Carro {

	private final int VELO_MAX;
	public int veloAtual;
	private int delta = 5;

	protected Carro(int veloMax) {

		VELO_MAX = veloMax;

	}

	public void acelerar() {

		if (veloAtual + getDelta() > VELO_MAX) {
			veloAtual = VELO_MAX;
		} else {
			veloAtual += getDelta();
		}
	}

	public void frear() {

		if (veloAtual >= 5) {
			veloAtual -= 5;
		} else {
			veloAtual = 0;
		}
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	public String toString() {
		return "Velocidade atual é " + veloAtual + "Km/h";
	}

}
