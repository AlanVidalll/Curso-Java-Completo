package classe;

public class DesafioClassePessoa {

	String nome;
	double peso;

	DesafioClassePessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;

	}

	void comer(DesafioClasseComida somaPeso) {

		if (somaPeso != null) {

			this.peso += somaPeso.peso;
		}

	}
	
	String apresentar() {
		
		return "Olá eu sou o " + nome + " e estou pesando "+ peso + "Kgs";
	}

}
