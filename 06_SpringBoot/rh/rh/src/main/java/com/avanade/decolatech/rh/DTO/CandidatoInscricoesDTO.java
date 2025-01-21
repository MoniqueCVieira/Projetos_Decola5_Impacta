package com.avanade.decolatech.rh.DTO;

import java.util.Date;

public class CandidatoInscricoesDTO {
	private String cpf;
	private String candidato;
	private Date dataInscricao;
	
	public CandidatoInscricoesDTO(String cpf, String candidato, Date data) {
		this.setCpf(cpf);
		this.setCandidato(candidato);
		this.setDataInscricao(data);
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCandidato() {
		return candidato;
	}
	public void setCandidato(String candidato) {
		this.candidato = candidato;
	}
	public Date getDataInscricao() {
		return dataInscricao;
	}
	public void setDataInscricao(Date dataInscricao) {
		this.dataInscricao = dataInscricao;
	}
	
	
}
