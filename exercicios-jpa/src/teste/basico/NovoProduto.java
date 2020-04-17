package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {
	
	public static void main(String[] args) {
		
		Produto produto = new Produto("tenis",247.55);
		
		DAO<Produto> dao = new DAO<>(Produto.class);
		//dao.abrirT().incluir(produto).fecharT().fechar();
		dao.incluirAtomico(produto);
		
		System.out.println("Id do produto: " + produto.getId());
		
	}

}
