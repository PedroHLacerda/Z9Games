package br.com.z9games.negorcio;

public class Game {

	private String nome;
	private String dataLancamento;
	private String plataforma;
	private double preco;

	public Game() {

		this.nome = "";
		this.dataLancamento = "";
		this.plataforma = "";
		this.preco = 0;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
