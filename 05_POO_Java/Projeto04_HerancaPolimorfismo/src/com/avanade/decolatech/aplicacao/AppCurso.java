package com.avanade.decolatech.aplicacao;
import com.avanade.decolatech.classes.Curso;

public class AppCurso {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setCodigo(100);
		curso1.setDescricao("Inteligencia Artificial");
		curso1.setCh(120);
		curso1.setPreco(4000);
		
		Curso curso2 = new Curso();
		curso2.setCodigo(200);
		curso2.setDescricao("Culinária Básica");
		curso2.setCh(8);
		curso2.setPreco(0);
		
		Curso curso3 = curso1;
		curso2 = null; // o objeto referenciado pelo curso2 virou "lixo" (garbage)
		
		System.gc(); // solicita prioridade na limpeza da memória heap
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(curso3);
	}
}