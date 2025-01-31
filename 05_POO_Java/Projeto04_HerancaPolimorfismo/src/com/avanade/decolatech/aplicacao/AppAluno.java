package com.avanade.decolatech.aplicacao;

import java.util.ArrayList;
import java.util.List;

import com.avanade.decolatech.classes.Curso;
import com.avanade.decolatech.enumeracoes.Generos;
import com.avanade.decolatech.classes.Aluno;

public class AppAluno {

	public static void main(String[] args) {
		// Criando uma lista de cursos
		List<Curso> cursos = new ArrayList<Curso>();
		
		// Adicionando os cursos c1 e c2 na lista cujo variavel se chama cursos
		cursos.add(new Curso("Oracle Básico", 40));
		cursos.add(new Curso("Análise de Dados", 32, 1000));
		
		// Criando uma instancia da Classe Aluno
		Aluno aluno = new Aluno();
		aluno.setNome("Alvaro Silva");
		aluno.setIdade(42);
		aluno.setGenero(Generos.MASCULINO);
		aluno.setMatricula(1234);
		aluno.adicionarCursos(new Curso("Inteligencia emocional", 40));

		System.out.println(aluno.getDados());
	}
}