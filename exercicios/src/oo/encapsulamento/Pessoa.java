package oo.encapsulamento;

public class Pessoa {

	private String nome;
	private String sobreNome;
	private int idade;

	public Pessoa(String nome, String sobreNome, int idade) {
		setNome(nome);
		setSobreNome(sobreNome);
		setIdade(idade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getNomeCompleto() {

		return getNome() + " " + getSobreNome();
	}

	// Getter metódo que faz a leitura de um atributo private.
	public int getIdade() {

		return idade;

	}

	// Setter metódo que altera um atributo private
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if (novaIdade >= 0 && novaIdade <= 100) {
			this.idade = novaIdade;
		}

	}

	@Override
	public String toString() {

		return "Olá eu sou o " + getNome() + ":)\ne tenho " + getIdade() + " anos:)";
	}

}
