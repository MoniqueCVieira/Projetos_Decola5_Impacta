package com.avanade.decolatech.classes;

import com.avanade.decolatech.enumeracoes.Generos;

public class Pessoa {
	private String nome;
	private int idade;
	private Generos genero;
	private Endereco endereco;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public Generos getGenero() {
		return genero;
	}
	
	public void setGenero(Generos genero) {
		this.genero = genero;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public String getDados() {
		StringBuilder builder = new StringBuilder();
		
		builder
			.append("Nome: ").append(this.getNome())
			.append("\nIdade: ").append(this.getIdade())
			.append("\nGenero: ").append(this.getGenero());
		
		if(this.getEndereco() != null) {
			builder
				.append("\n\n").append(this.getEndereco().getDados());
			
		}
		
		return builder.toString();
	}
}