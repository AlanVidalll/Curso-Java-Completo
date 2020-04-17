package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Ator;
import modelo.muitospramuitos.Filme;

public class MuitosPraMuitos2 {
	
	public static void main(String[] args) {
		
		Filme filme1 = new Filme("Missão Impossivel",8.7);
		Filme filme2 = new Filme("Tomb Raider",5.6);
		
		
		Ator ator1 = new Ator("Tom Cruize");
		Ator ator2 = new Ator("Angelina Julie");
		
		filme1.adicionarAtor(ator1);
		filme1.adicionarAtor(ator2);
		
		filme2.adicionarAtor(ator1);
		
	
		
		DAO<Object> dao = new DAO<>();
		
		dao.incluirAtomico(filme1);
		
		
	
	}

}
