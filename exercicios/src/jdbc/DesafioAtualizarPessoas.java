package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DesafioAtualizarPessoas {

	public static void main(String[] args) throws SQLException {

		Scanner entrada = new Scanner(System.in);
		String select = "SELECT codigo,nome FROM pessoas WHERE codigo = ?";
		String update = "UPDATE pessoas SET nome = ? WHERE codigo = ?";

		System.out.println("Informe o código a ser alterado?");
		int codigo = entrada.nextInt();
		Connection conexao = FabricaConexao.getConexao();
		PreparedStatement stmt = conexao.prepareStatement(select);
		stmt.setInt(1, codigo);
		ResultSet r = stmt.executeQuery();

		if (r.next()) {
			Pessoa p = new Pessoa(r.getInt(1), r.getString(2));
			System.out.println("O nome Atual é " + p.getNome());
			entrada.nextLine();

			System.out.println("Informe o novo nome?");
			String novoNome = entrada.nextLine();
			stmt.close();
			stmt = conexao.prepareStatement(update);
			stmt.setString(1, novoNome);
			stmt.setInt(2, codigo);
			stmt.execute();
			stmt.close();

			System.out.println( "Nome alterado para: " + novoNome );

		}else {
			System.out.println("Pessoa não encontrada!");
		}
		conexao.close();
		entrada.close();
	}

}
