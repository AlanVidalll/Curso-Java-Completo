package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {

	private boolean ligarturbo = false;
	private boolean ligarAr = false;

	public Ferrari() {

		this(420);

	}

	public Ferrari(int veloMax) {
		super(veloMax);
		setDelta(15);
	}

	@Override
	public void ligarTurbo() {
		ligarturbo = true;
	}

	@Override
	public void desligarTurbo() {
		ligarturbo = false;
	}

	@Override
	public void ligarAr() {
		ligarAr = true;
	}

	@Override
	public void desligarAr() {
		ligarAr = false;
	}
	
	

	@Override
	public int getDelta() {
		if (ligarturbo && !ligarAr) {
			return 35;
		} else if (ligarturbo && ligarAr) {
			return 30;
		}else if(!ligarturbo && !ligarAr) {
			return 20;
		}else {
			return 15;
		}
	}
}
