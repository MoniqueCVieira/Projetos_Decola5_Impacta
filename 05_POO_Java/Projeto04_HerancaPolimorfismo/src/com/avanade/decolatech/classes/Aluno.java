package com.avanade.decolatech.classes;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
	
	private int matricula;
	private List<Curso> cursos;
	
	public int getMatricula() {return matricula;}
	
	public void setMatricula(int matricula) {this.matricula = matricula;}
	
	public List<Curso> getCursos() {return cursos;}
	
	public void setCursos(List<Curso> cursos) {this.cursos = cursos;}
	// método que retorna a lista de cursos, se existirem
	private String listarCursos() {
		StringBuilder builder = new StringBuilder();
		int posicao = 1;
		for(Curso c : this.getCursos()) {
			builder.append("Curso ").append(posicao++)
			.append("\ncódigo: ").append(c.getCodigo())
			.append("\ndescricao: ").append(c.getDescricao())
			.append("\n\n");
		}
		return builder.toString();
	}

	@Override
	public String getDados() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.getDados())
		.append("\n\n")
		.append("Matricula: ").append(this.getMatricula());
		
		if(this.getCursos() != null && this.getCursos().size() > 0) {
			builder.append("\n").append(this.listarCursos());
		} else {
			builder.append("\n\nNenhum curso matriculado para este aluno!");
		}
		return builder.toString();
	}
	
	//método para adicionar um curso
	public void adicionarCursos(Curso curso) {
		if(this.getCursos() == null) {
			this.cursos = new ArrayList<Curso>();			
		}
		this.cursos.add(curso);
	}
}
