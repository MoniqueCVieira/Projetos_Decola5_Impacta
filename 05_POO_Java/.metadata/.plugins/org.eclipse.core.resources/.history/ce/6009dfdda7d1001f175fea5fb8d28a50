package com.avanade.decolatech.classes;

public class Curso {
	
	private int codigo;
	private String descricao;
	private int ch;
	private double preco;
	
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
			throw new NumberFormatException("A carga horária deve ser maior que 0 horas.");
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
	// 1. metodo para receber os valores de todos os atributs
	public void setDados(int codigo, String descricao, int ch, double preco) {
		this.setCodigo(codigo);
		this.setDescricao(descricao);
		this.setCh(ch);
		this.setPreco(preco);
	}
	
	// 2. método para retornar as informações do curso
	public String getDados() {
		String resposta = "Código: " + this.getCodigo() +
				"\nDescrição: " + this.getDescricao() +
				"\nCarga Horária: " + this.getCh() +
				"\nPreço: " + this.getPreco(); 
		return resposta;
	}
}