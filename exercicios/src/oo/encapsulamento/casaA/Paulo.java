package oo.encapsulamento.casaA;

public class Paulo {

	void testeAcessos() {

		Ana esposa = new Ana();
		// System.out.println(esposa.segredo);// private somente a ana pode acessar
		System.out.println(esposa.facoDentroDeCasa);
		// nivel pacote(PADRÃO) somente paulo pode acessar pois ele esta no mesmo pacote
		System.out.println(esposa.formaDeFalar);
		/*
		 * aqui somente paulo e pedro tem acesso. pois e nivel protected o paulo acessa
		 * pois esta no mesmo pacote e pedro e uma sub classe em outro pacote (FILHO).
		 */
		System.out.println(esposa.todosSabem);
		/*
		 * Esse todos tem acesso pois está no nível publíco e pode ser acessado de
		 * qualquer outro lugar
		 */
	}

}
