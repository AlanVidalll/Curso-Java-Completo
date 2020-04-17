package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {
	
	public static void main(String[] args) {
		

		Aluno a1 = new Aluno("Alan", 7.1);
		Aluno a2 = new Aluno("Bruno", 8.1);
		Aluno a3 = new Aluno("Leo", 8.3);
		Aluno a4 = new Aluno("Jessica", 10);
		Aluno a5 = new Aluno("Alan", 7.2);
		Aluno a6 = new Aluno("Pedro", 8.1);
		Aluno a7 = new Aluno("Leo", 3.3);
		Aluno a8 = new Aluno("Marilia", 10);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8);
		
		System.out.println("distinct...");
		alunos.stream().distinct().forEach(System.err::println);
		
		System.out.println("\nSkip/Limit");
		alunos.stream()
		.distinct()
		.skip(2)
		.limit(2)
		.forEach(System.err::println);
		
		System.out.println("\ntakeWhile");
		alunos.stream()
		.distinct()
		.skip(2)
		.takeWhile(a -> a.nota >= 7)
		.forEach(System.err::println);
		
		
	}

}
