package com.avanade.decolatech.rh.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="TB_CANDIDATOS")
public class Candidato {
	@Id
	@Column(name="CPF")
	private String cpf;
	@Column(name="NOME")
	private String nome;
	@Column(name="TELEFONE")
	private String telefone;
	@Column(name="EMAIL")
	private String email;
	@OneToMany(cascade =CascadeType.ALL, fetch=FetchType.LAZY, mappedBy = "candidato")
	private List<Inscricao> inscricoes;
	
	public Candidato(String cpf, String nome, String telefone, String email) {
		super();
		this.setCpf(cpf);
		this.setNome(nome);;
		this.setTelefone(telefone);
		this.setEmail(email);
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Inscricao> getInscricoes() {
		return inscricoes;
	}
	public void setInscricoes(List<Inscricao> inscricoes) {
		this.inscricoes = inscricoes;
	}
	
	
}
