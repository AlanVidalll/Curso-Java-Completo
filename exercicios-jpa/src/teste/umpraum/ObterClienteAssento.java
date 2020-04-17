package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class ObterClienteAssento {

	public static void main(String[] args) {

		DAO<Cliente> daoCliente = new DAO<>(Cliente.class);

		Cliente cliente = daoCliente.obterPorId(2L);

		System.out.println("Assento: " + cliente.getAssento().getNome());
		daoCliente.fechar();
		
		DAO<Assento> daoAssento = new DAO<>(Assento.class);
		Assento assento = daoAssento.obterPorId(5L);
		
		System.out.println("Assento: " + assento.getCliente().getNome());
		
		daoAssento.fechar();

	}

}
