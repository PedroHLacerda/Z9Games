package br.com.z9games.controle;

/**
 * @author 
 *
 */
public class ControleItemVenda {
	
	private int codigo;
	private String nome;
	private double precoVenda;
	
	
	/**
	 * @param codigo
	 * @param nome
	 * @param precoVenda
	 */
	public ControleItemVenda(int codigo, String nome, double precoVenda) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.precoVenda = precoVenda;
	}

	/**
	 * @return
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return
	 */
	public double getPrecoVenda() {
		return precoVenda;
	}
	/**
	 * @param precoVenda
	 */
	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}
	
	
}
