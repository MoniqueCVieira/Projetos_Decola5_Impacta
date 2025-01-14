package com.avanade.decolatech.rh.entities;

import java.sql.Date;

import org.apache.logging.log4j.message.AsynchronouslyFormattable;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
@AsynchronouslyFormattable(name = "TB_Incricao")
public class Inscricao {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTIFY)
	private int id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_CARGO")
	private Cargo cargo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CPF")
	private Candidato candidato;
	
	@Column(name = "ID_SITUACAO")
	private int situacao;
	
	@Column(name = "ID_DATAINCRICAO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataIncricao;
	
	@Column(name = "ID_DATAEFETIVACAO")
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

	public Date getDataIncricao() {
		return dataIncricao;
	}

	public void setDataIncricao(Date dataIncricao) {
		this.dataIncricao = dataIncricao;
	}

	public Date getDataEfetivacao() {
		return dataEfetivacao;
	}

	public void setDataEfetivacao(Date dataEfetivacao) {
		this.dataEfetivacao = dataEfetivacao;
	}
}