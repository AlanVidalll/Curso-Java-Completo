package teste.heranca;

import infra.DAO;
import modelo.heran�a.Aluno1;
import modelo.heran�a.AlunoBolsista1;

public class NovoAluno {
	
	public static void main(String[] args) {
		
		
		DAO<Aluno1> alunoDAO = new DAO<>();
		
		Aluno1 aluno = new Aluno1(123L,"Rogerio");
		AlunoBolsista1 aluno1 = new AlunoBolsista1(321L,"Maria",1000);
		
		alunoDAO.incluirAtomico(aluno);
		alunoDAO.incluirAtomico(aluno1);
		
		alunoDAO.fechar();
		
	}

}
