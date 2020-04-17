package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		Ferrari f50 = new Ferrari(420);
		f50.ligarTurbo();
		f50.ligarAr();
		f50.desligarAr();
		f50.acelerar();
		f50.frear();
		System.out.println(f50.nivelAr());
		System.out.println(f50);
		f50.acelerar();
		f50.frear();
		System.out.println(f50);
		f50.acelerar();
		
		System.out.println(f50);
		
		System.out.println();
		
		
		Carro civic = new Civic();
		
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		System.out.println(civic);
		civic.frear();
		System.out.println(civic);
	}

}
