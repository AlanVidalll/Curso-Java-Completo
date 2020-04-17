package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	final String nome;

	List<Aluno> alunos = new ArrayList<>();

	Curso(String nome) {

		this.nome = nome;
	}

	void adicionarAluno(Aluno aluno) {
		// Criamos uma relação bidirecional!!!
		this.alunos.add(aluno);
		aluno.cursos.add(this);

	}

}
