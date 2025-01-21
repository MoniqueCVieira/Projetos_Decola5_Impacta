package com.avanade.decolatech.rh.DTO;

public class NovoCargoDTO {
	private int idArea;
	private String descricao;
	private double salario;
	private int tipoSalario;
	
	public int getIdArea() {
		return idArea;
	}
	public void setIdArea(int idArea) {
		this.idArea = idArea;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getTipoSalario() {
		return tipoSalario;
	}
	public void setTipoSalario(int tipoSalario) {
		this.tipoSalario = tipoSalario;
	}
}
