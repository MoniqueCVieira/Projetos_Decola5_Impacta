package com.avanade.decolatech.aplicacao;

import javax.swing.JOptionPane;

import com.avanade.decolatech.classes.Funcionario;
import com.avanade.decolatech.enumeracoes.Generos;

public class AppFuncionario {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Seokjin Kim");
		funcionario.setIdade(31);
		funcionario.setGenero(Generos.MASCULINO);
		funcionario.setCargo("Professor");
		funcionario.setSalario(20000);
		
		JOptionPane.showMessageDialog(null, funcionario.getDados());

	}

}
