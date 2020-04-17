package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Alan", 7.5);
		Aluno a2 = new Aluno("Bruno", 7.0);
		Aluno a3 = new Aluno("Leo", 9.3);
		Aluno a4 = new Aluno("Jessica", 4.0);
		Aluno a5 = new Aluno("Maria", 2.0);
		Aluno a6 = new Aluno("Jose", 3.7);
		
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6);
		
		Predicate<Aluno> aprovados = a -> a.nota >= 7;
		
		Function<Aluno, String> saudacao = 
				a -> "Parabéns " + a.nome + "! Você foi aprovado!";
		
		alunos.stream()
		.filter(aprovados)
		.map(saudacao)
		.forEach(System.out::println);
		
	}

}
