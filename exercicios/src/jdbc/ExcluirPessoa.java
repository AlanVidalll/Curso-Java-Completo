package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

	public static void main(String[] args) throws SQLException {

		Scanner entrada = new Scanner(System.in);

		String select = "SELECT codigo,nome FROM pessoas WHERE codigo = ?";
		String delete = "DELETE FROM pessoas WHERE codigo = ?";

		System.out.println("Informe o código a ser excluido?");
		int codigo = entrada.nextInt();
		Connection conexao = FabricaConexao.getConexao();
		PreparedStatement stmt = conexao.prepareStatement(select);
		stmt.setInt(1, codigo);
		ResultSet r = stmt.executeQuery();

		if (r.next()) {
			Pessoa p = new Pessoa(r.getInt(1), r.getString(2));

			System.err.println("A pessoa a ser exclúido é " + p.getNome() + "\n");
			entrada.nextLine();
			System.out.println("Deseja excluir essa pessoa?\n" 
			+ "Digite 'Sim' para remover ou 'Não para cancelar!");
			String resposta = entrada.next();
			
			if (resposta.equalsIgnoreCase("Sim")) {
				stmt.close();
				stmt = conexao.prepareStatement(delete);
				stmt.setInt(1, codigo);
				stmt.execute();

				System.err.println(p.getNome() + " foi removida com sucesso!");
			} else {
				System.err.println("Pessoa não foi removida!");
			}
			stmt.close();
		} else {
			System.err.println("Pessoa fora do banco de dados!");
		}

		conexao.close();
		entrada.close();

	}
}
