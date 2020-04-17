package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento2 {
	
	public static void main(String[] args) {
		
	

	Assento assento = new Assento("10F");
	Cliente cliente = new Cliente("Rogerio", assento);
	
	DAO<Cliente> dao = new DAO<>(Cliente.class);
	dao.incluirAtomico(cliente);
}
}
