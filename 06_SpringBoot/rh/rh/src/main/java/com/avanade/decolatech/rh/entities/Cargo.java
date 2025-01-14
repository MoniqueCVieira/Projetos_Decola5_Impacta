package com.avanade.decolatech.rh.entities;

import 

@Entity
@Table(name = "TB_Cargo")
public class Cargo {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTIFY)
	private int id;
	
	@MantToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_AREA")
	private Area area;
	
	@Column(name = "DESCRICAO")
	private String descricao;
	
	@Column(name = "SALARIO")
	private double salario;
	
	@Column(name = "TP_SALARIO")
	private int tipoSalario;
	
	@OneToMany(cascada = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Inscricao> inscricoes;

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