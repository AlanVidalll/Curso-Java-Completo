package infra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class DAO<E> {

	private static EntityManagerFactory emf;
	private EntityManager em;
	private Class<E> classe;

	static {

		try {
			emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		} catch (Exception e) {
			// logar -> log4j
		}
	}

	public DAO() {
		this(null);
	}

	public DAO(Class<E> classe) {
		this.classe = classe;
		em = emf.createEntityManager();
	}

	public DAO<E> abrirT() {

		em.getTransaction().begin();
		return this;
	}

	public DAO<E> fecharT() {

		em.getTransaction().commit();
		return this;
	}

	public DAO<E> incluir(E entidade) {

		em.persist(entidade);
		return this;
	}

	public List<E> ObterTodos() {
		return this.ObterTodos(5, 0);

	}

	public List<E> ObterTodos(int quant, int deslocamento) {
		if (classe == null) {
			throw new UnsupportedOperationException("Classe nula");
		}

		String jpql = "select e from " + classe.getName() + " e";
		TypedQuery<E> query = em.createQuery(jpql, classe);
		query.setMaxResults(quant);
		query.setFirstResult(deslocamento);
		return query.getResultList();
	}

	public DAO<E> incluirAtomico(E entidade) {

		return this.abrirT().incluir(entidade).fecharT();

	}
	
	public E obterPorId(Object id) {
		return em.find(classe, id);
		
	}

	public void fechar() {
		em.close();

	}

	public DAO<E> fechar2() {
		em.close();
		return this;
	}

	public List<E> consultar(String NomeConsulta, Object ...params){
		TypedQuery<E> query = em.createNamedQuery(NomeConsulta,classe);
		for (int i = 0; i < params.length; i+= 2) {
			query.setParameter(params[i].toString(),params[i +1]);
		}
		return query.getResultList();
		
	}
	
	public  E consultarUM(String NomeConsulta, Object ...params){
		List<E> lista = consultar(NomeConsulta,params); 
		return lista.isEmpty() ? null : lista.get(0);
	}
	

}
