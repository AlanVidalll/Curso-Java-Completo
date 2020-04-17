package oo.heranca.desafio;

public interface Luxo {
	
	public void ligarAr();
	public void desligarAr();
	
	default int nivelAr() {
		return 1;
	}
	

}
