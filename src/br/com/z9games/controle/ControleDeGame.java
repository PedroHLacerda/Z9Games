package br.com.z9games.controle;

import br.com.z9games.dados.RepositorioCliente;
import br.com.z9games.dados.RepositorioGames;
import br.com.z9games.negorcio.Game;

public class ControleDeGame {

	private RepositorioGames reporGame;

	public ControleDeGame() {

		this.reporGame = new RepositorioGames();
	}

	public void salvarGame(Game novoGame) throws Exception {

		this.reporGame.salvarGame(novoGame);

	}

}
