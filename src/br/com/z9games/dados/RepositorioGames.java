package br.com.z9games.dados;

import br.com.z9games.negorcio.Cliente;
import br.com.z9games.negorcio.Game;

public class RepositorioGames extends Conexao {

	private String sql;

	public RepositorioGames() {

		this.sql = "";

	}

	public void salvarGame(Game novoGame) throws Exception {

		openBD();

		if (novoGame != null) {

			sql = "INSERT INTO main.game(nome,plataforma,data_lancamento,preco)VALUES(?,?,?,?)";

			prstm = Conexao.prepareStatement(sql);

			prstm.setString(1, novoGame.getNome());
			prstm.setString(2, novoGame.getPlataforma());
			prstm.setString(3, novoGame.getDataLancamento());
			prstm.setDouble(4, novoGame.getPreco());
			prstm.executeUpdate();

			throw new Exception("Game: "+novoGame.getNome()+" Cadastrado com Sucesso!");
		}
	}

}
