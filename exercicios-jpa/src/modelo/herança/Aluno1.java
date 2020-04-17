package modelo.herança;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
// SE TROCAR SINGLE_TABLE POR JOINED ELE CRIA 2 TABELAS NO BANCO DE DADOS!
@DiscriminatorColumn(name = "tipo", length = 2, discriminatorType 
= DiscriminatorType.STRING) 
@DiscriminatorValue("AL")
public class Aluno1 {

	@Id
	private Long matricula;

	private String nome;

	public Aluno1() {

	}

	public Aluno1(Long matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
