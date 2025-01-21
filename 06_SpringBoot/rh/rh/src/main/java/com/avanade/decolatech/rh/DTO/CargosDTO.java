package com.avanade.decolatech.rh.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CargosDTO {
	@JsonProperty("id")
	private int idCargo;
	@JsonProperty("area")
	private String descricaoArea;
	@JsonProperty("cargo")
	private String descricaoCargo;
	private double salario;
	@JsonProperty("tipo")
	private String tipoSalario;
	
	
	public CargosDTO(int idCargo, String descricaoArea, String descricaoCargo, double salario, String tipoSalario) {
		super();
		this.setIdCargo(idCargo);;
		this.setDescricaoArea(descricaoArea);;
		this.setDescricaoCargo(descricaoCargo);;
		this.setSalario(salario);
		this.setTipoSalario(tipoSalario);
	}
	public int getIdCargo() {
		return idCargo;
	}
	public void setIdCargo(int idCargo) {
		this.idCargo = idCargo;
	}
	public String getDescricaoArea() {
		return descricaoArea;
	}
	public void setDescricaoArea(String descricaoArea) {
		this.descricaoArea = descricaoArea;
	}
	public String getDescricaoCargo() {
		return descricaoCargo;
	}
	public void setDescricaoCargo(String descricaoCargo) {
		this.descricaoCargo = descricaoCargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getTipoSalario() {
		return tipoSalario;
	}
	public void setTipoSalario(String tipoSalario) {
		this.tipoSalario = tipoSalario;
	}
	
	
}
