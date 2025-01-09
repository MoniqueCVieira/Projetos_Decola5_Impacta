package com.avanade.decolatech.aplicacao;

import com.avanade.decolatech.classes.Curso;

public class AppCurso {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.codigo = 100;
		curso1.descricao = "Inteligencia Artificial";
		curso1.cargahoraria = 120;
		curso1.preco = 4000;
		
		Curso curso2 = new Curso();
		curso2.codigo = 200;
		curso2.descricao = "Culinária Básica";
		curso2.cargahoraria = 8;
		curso2.preco = 0;
		
		Curso curso3 = curso1;
		curso2 = null; // o objeto referenciado pelo curso2 virou "lixo" (garbage)
		
		System.gc(); // solicita prioridade na limpeza da memória heap
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(curso3);
	}
}