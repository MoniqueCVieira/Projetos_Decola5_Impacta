package com.avanade.decolatech.aplicacao;

import javax.swing.JOptionPane;

import com.avanade.decolatech.classes.Endereco;
import com.avanade.decolatech.classes.Pessoa;
import com.avanade.decolatech.enumeracoes.Generos;

public class AppPessoa {
	public static void main(String[] args) {
		Endereco end = new Endereco("Rua da Paz", 10, "Recife", "54001-000");
		
		Pessoa p = new Pessoa();
		p.setNome("Choi San");
		p.setIdade(25);
		p.setGenero(Generos.MASCULINO);
		p.setEndereco(end);
		
		JOptionPane.showMessageDialog(null, p.getDados());
		
	}
}