package com.avanade.decolatech.classes;

//modelo ou entidade
public class Curso {
	
	//atributos ou variaveis de instancia
	private int codigo;
	private String descricao;
	private int ch;
	private double preco;
	
	public Curso(String string, int i, int j) {

	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getCh() {
		return ch;
	}
	public void setCh(int ch) {
		// a carga horária deve ser maior que 0
		if(ch <= 0) {
			throw new NumberFormatException("A carga horária deve ser positiva.");
		}
		this.ch = ch;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		if(preco < 0) {
			throw new NumberFormatException("O preço não pode ser negativo!");
		}
		this.preco = preco;
	}
	
	// métodos complementares
	// 1. Método para receber os valores de todos os atributos
	public void setDados(int codigo, String descricao, int ch, double preco) {
		this.setCodigo(codigo);
		this.setDescricao(descricao);
		this.setCh(ch);
		this.setPreco(preco);
	}
	
	// 2. método para retornar as informações do curso
	public String getDados() {
		return "Código: " + this.getCodigo() +
					"\nDescrição: " + this.getDescricao() +
					"\nCarga Horária: " + this.getCh() +
					"\nPreço: R$" + this.getPreco();
		return resposta;
	}
}