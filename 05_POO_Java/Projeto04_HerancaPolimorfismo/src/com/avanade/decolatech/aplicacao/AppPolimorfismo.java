package com.avanade.decolatech.aplicacao;

import javax.swing.JOptionPane;

import com.avanade.decolatech.classes.Funcionario;
import com.avanade.decolatech.classes.Pessoa;
import com.avanade.decolatech.enumeracoes.Generos;

public class AppPolimorfismo {
	public static void main(String[] args) {

		Pessoa p = new Pessoa();
		p.setNome("José Manoel");
		p.setIdade(55);
		p.setGenero(Generos.MASCULINO);
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Seokjin Kim");
		funcionario.setIdade(31);
		funcionario.setGenero(Generos.MASCULINO);
		funcionario.setCargo("Professor");
		funcionario.setSalario(20000);
		
		Pessoa pessoa = p;
		JOptionPane.showMessageDialog(null, pessoa.getDados());

		
		pessoa = funcionario;
		JOptionPane.showMessageDialog(null, pessoa.getDados());
	}
}
