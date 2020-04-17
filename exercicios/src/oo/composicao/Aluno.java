package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	final String nome;

	List<Curso> cursos = new ArrayList<>();

	Aluno(String nome) {
		this.nome = nome;

	}

	void adicionarCurso(Curso curso) {

		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	Curso obterCursoPorNOme(String nome) {
		
		for(Curso curso : this.cursos) {
			if(curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		return null;
	}
	
	public String toString() {//metodo para converter um objeto para um formato string!!!
		return "Meu  nome é " + nome;
	}

}
