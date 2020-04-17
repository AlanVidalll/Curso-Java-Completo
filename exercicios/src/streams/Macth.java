package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Macth {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Alan", 7.1);
		Aluno a2 = new Aluno("Bruno", 8.1);
		Aluno a3 = new Aluno("Leo", 3.3);
		Aluno a4 = new Aluno("Jessica", 10);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Predicate<Aluno> reprovado =  aprovado.negate();

		System.out.println(alunos.stream().allMatch(aprovado));
		//allMatch verifica se todos foi aprovado, retorna true ou false.
		System.out.println(alunos.stream().anyMatch(aprovado));
		//anyMatch verifica se pelo menos 1 foi aprovado, retorna true ou false.
		System.err.println(alunos.stream().noneMatch(reprovado));
		/*noneMatch aqui ele verificou se tem algum reprovado, 
		se tiver retorna false , senão true*/
	}

}
