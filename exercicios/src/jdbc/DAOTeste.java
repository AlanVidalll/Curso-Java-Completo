package jdbc;

public class DAOTeste {

	
	public static void main(String[] args) {
		DAO dao = new DAO();
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		System.out.println(dao.incluir(sql, "João da Silva"));
		System.out.println(dao.incluir(sql, "Ana Lucia"));
		System.out.println(dao.incluir(sql, "Rogerio Almeida"));
		System.out.println(dao.incluir(sql, "Lionel Messi"));
		
		dao.close();
	}
}
