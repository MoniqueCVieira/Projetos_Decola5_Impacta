package com.avanade.decolatech.rh.entities;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name= "TB_INSCRICOES")
public class Inscricao {
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_CARGO")
	private Cargo cargo;
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CPF")
	private Candidato candidato;
	@Column(name = "SITUACAO")
	private int situacao;
	@Column(name = "DATA_INSCRICAO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataInscricao;
	@Column(name = "DATA_EFETIVACAO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataEfetivacao;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	public Candidato getCandidato() {
		return candidato;
	}
	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}
	public int getSituacao() {
		return situacao;
	}
	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}
	public Date getDataInscricao() {
		return dataInscricao;
	}
	public void setDataInscricao(Date dataInscricao) {
		this.dataInscricao = dataInscricao;
	}
	public Date getDataEfetivacao() {
		return dataEfetivacao;
	}
	public void setDataEfetivacao(Date dataEfetivacao) {
		this.dataEfetivacao = dataEfetivacao;
	}
	
	
}
