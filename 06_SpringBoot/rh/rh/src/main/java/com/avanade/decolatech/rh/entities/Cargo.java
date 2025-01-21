package com.avanade.decolatech.rh.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="TB_CARGO")
public class Cargo {
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_AREA")
	private Area area;
	@Column(name="DESCRICAO")
	private String descricao;
	@Column(name="SALARIO")
	private double salario;
	@Column(name="TP_SALARIO")
	private int tipoSalario;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "cargo")
	private List<Inscricao> inscricoes;
	
	public Cargo() {
		
	}
	
	public Cargo(int id, double salario, int tipoSalario) {
		this.setId(id);
		this.setSalario(salario);
		this.setTipoSalario(tipoSalario);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Area getArea() {
		return area;
	}
	public void setArea(Area area) {
		this.area = area;
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
	public List<Inscricao> getInscricoes() {
		return inscricoes;
	}
	public void setInscricoes(List<Inscricao> inscricoes) {
		this.inscricoes = inscricoes;
	}
	
	
}
