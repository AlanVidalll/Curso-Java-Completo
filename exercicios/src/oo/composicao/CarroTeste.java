package oo.composicao;

public class CarroTeste {

	public static void main(String[] args) {

		Carro c1 = new Carro();
		System.out.println(c1.estaLigado());

		c1.ligar();
		System.out.println(c1.estaLigado());

		System.out.println(c1.motor.giros());

		c1.acelerara();
		c1.acelerara();
		c1.acelerara();
		c1.acelerara();

		System.out.println(c1.motor.giros());

		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();

		// FAltou o encapsulamento!!!
		// c1.motor.fatorInjecao = -30;
		System.out.println(c1.motor.giros());

		// relação bidirecional
		System.out.println(c1.motor.carro.motor.carro.motor.giros());
	}

}
