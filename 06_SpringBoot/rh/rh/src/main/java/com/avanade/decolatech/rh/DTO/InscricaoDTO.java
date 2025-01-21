package com.avanade.decolatech.rh.DTO;

import java.util.Date;

public class InscricaoDTO {
	private String area;
	private String cargo;
	private Date dataInscricao;
	private String candidato;
	private String telefone;
	
	public InscricaoDTO(String area, String cargo, Date data, String candidato, String telefone) {
		this.setArea(area);
		this.setCargo(cargo);
		this.setDataInscricao(data);
		this.setCandidato(candidato);
		this.setTelefone(telefone);
	}
	
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Date getDataInscricao() {
		return dataInscricao;
	}
	public void setDataInscricao(Date dataInscricao) {
		this.dataInscricao = dataInscricao;
	}
	public String getCandidato() {
		return candidato;
	}
	public void setCandidato(String candidato) {
		this.candidato = candidato;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
