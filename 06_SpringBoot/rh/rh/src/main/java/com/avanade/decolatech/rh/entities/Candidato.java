package com.avanade.decolatech.rh.entities;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_Candidato)
public class Candidato {
	@Id
	@Columm(name = "CPF")
	private String cpf;
	
	@Columm(name = "NOME")
	private String nome;
	
	@Columm(name = "TELEFONE")
	private String telefone;
	
	@Columm(name = "EMAIL")
	private String email;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = Fetch.LAZY, mappedBy = "candidato")
	private List<Inscricao> inscricoes;

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