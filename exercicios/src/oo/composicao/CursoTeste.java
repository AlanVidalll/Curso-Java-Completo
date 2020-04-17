package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("Alan Vidal");
		Aluno aluno2 = new Aluno("Marina Silva");
		Aluno aluno3 = new Aluno("Lionel Messi");

		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("React Native");
		Curso curso3 = new Curso("PHP Completo");

		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);

		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);

		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);

		for (Aluno aluno : curso1.alunos) {
			System.out.println("Curso 1, nome do aluno: " + aluno.nome);

		}
		System.out.println();

		System.out.println(aluno1.cursos.get(0).alunos);
		// aqui ele retorna os nomes dos alunos no curso 1 que e o indice 0!!!

		System.out.println();

		for (Curso curso : aluno1.cursos) {

			System.out.println("Estou no curso de " + curso.nome);
		}
		
		System.out.println();
		
	  Curso cursoEncontrado = aluno1.obterCursoPorNOme("web");
	  if(cursoEncontrado != null) {
		  System.out.println(cursoEncontrado.nome);
		  System.out.println(cursoEncontrado.alunos);
	  }else {
		  System.out.println("Curso Inexistente");
	  }

	}

}
