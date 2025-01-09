package com.avanade.decolatech.classes;

import java.util.List;

public class Aluno extends Pessoa {
	
	private int matricula;
	private List<Curso> cursos;
	
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public List<Curso> getCursos() {
		return cursos;
	}
	
	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
}