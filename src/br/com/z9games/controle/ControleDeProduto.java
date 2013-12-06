package br.com.z9games.controle;

public class ControleDeProduto extends ControleItemVenda {

	private double precoCusto;
	private int qtdeEstoque;

	/**
	 * @param codigo
	 * @param nome
	 * @param precoVenda
	 * @param precoCusto
	 * @param qtdeEstoque
	 */
	public ControleDeProduto(int codigo, String nome, double precoVenda, double precoCusto, int qtdeEstoque) {
		super(codigo, nome, precoVenda);
		this.precoCusto = precoCusto;
		this.qtdeEstoque = qtdeEstoque;
	}

	/**
	 * @return
	 */
	public double getPrecoCusto() {
		return precoCusto;
	}

	/**
	 * @param precoCusto
	 */
	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}
	
	/**
	 * @return
	 */
	public int getQtdeEstoque() {
		return qtdeEstoque;
	}


	/**
	 * @param qtdeEstoque
	 */
	public void setQtdeEstoque(int qtdeEstoque) {
		this.qtdeEstoque = qtdeEstoque;
	}

}
