package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3 {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 2L);
		usuario.setNome("Ibrahmovic");
		usuario.setEmail("Ibrah@gmail.com");
		em.detach(usuario);
		// tira o objeto do sistema gerenciado e so da update chamando o merge()
		
		em.merge(usuario);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
