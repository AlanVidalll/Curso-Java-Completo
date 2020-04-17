package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Alan", 7.1);
		Aluno a2 = new Aluno("Bruno", 8.1);
		Aluno a3 = new Aluno("Leo", 3.3);
		Aluno a4 = new Aluno("Jessica", 10);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);
		
		Comparator<Aluno> melhornota = (aluno1,aluno2) -> {
			
			if(aluno1.nota > aluno2.nota) return 1;
			if(aluno1.nota < aluno2.nota) return -1;
			return 0;
		};
		System.out.println(alunos.stream().max(melhornota).get());
		System.out.println(alunos.stream().min(melhornota).get());
	}
}
