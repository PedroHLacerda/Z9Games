package br.com.z9games.negorcio;

import java.util.Date;

/**
 * @author Adriano Vasconcelos
 *
 */
public class Servico extends ItemVenda {

	private Date duracao;
	

	/**
	 * @param codigo
	 * @param nome
	 * @param precoVenda
	 * @param data
	 */
	public Servico(int codigo, String nome, double precoVenda, Date data) {
		super(codigo, nome, precoVenda);
		this.duracao = data;
	}
	
	/**
	 * @return
	 */
	public Date getDuracao() {
		return duracao;
	}
	
	/**
	 * @param data
	 */
	public void setDuracao(Date data) {
		this.duracao = data;
	}
}
