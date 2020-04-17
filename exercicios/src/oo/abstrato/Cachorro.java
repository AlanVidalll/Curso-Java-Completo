package oo.abstrato;

public class Cachorro extends Mamifero {

	@Override
	public String mover() {
		return "Usando patas";
	}

	@Override
	public String mamar() {
		return "Usando leite";
	}
}
