package br.com.z9games.controle;

import br.com.z9games.dados.RepositorioCliente;
import br.com.z9games.negorcio.Cliente;

public class ControleDeCliente {

	private RepositorioCliente reporCliente;

	public ControleDeCliente() {
		reporCliente = new RepositorioCliente();
	}
	
	public void salvarCliente(Cliente novoCliente) throws Exception {

		this.reporCliente.salvarCliente(novoCliente);
	}

}
