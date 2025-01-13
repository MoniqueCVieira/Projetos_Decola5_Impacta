package com.avanade.decolatech.aplicacao;

import com.avanade.decolatech.classes.Funcionario;
import com.avanade.decolatech.classes.Pessoa;
import com.avanade.decolatech.enumeracoes.Generos;

public class AppPolimorfismo2 {
	public static void main(String[] args) {
		Pessoa pessoa = new Funcionario();
		pessoa.setNome("Anderson Costa");
		pessoa.setIdade(32);
		pessoa.setGenero(Generos.MASCULINO);
		
		//como fazemos para fornecer os dados
		// do cargo e do salário
		Funcionario func = (Funcionario)pessoa;
		func.setCargo("Estágiario");
		func.setSalario(15000);
		
//		No código acima:
//			Funcionario func = (Funcionario)pessoa;
//		estamos dizendo que a variável pessoa, mesmo sendo do tido da classe
//		Pessoa, está referenciando um objeto da classe Funcionario.
//		
	}
}