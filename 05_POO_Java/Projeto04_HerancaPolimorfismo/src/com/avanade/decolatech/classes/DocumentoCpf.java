package com.avanade.decolatech.classes;

import com.avanade.decolatech.interfaces.Documento;

public class DocumentoCpf implements Documento{
	@Override
	public void setNumero(String numero) {
		if(numero.length() != 11) {
			throw new IllegalArgumentException("O CPF deve ter 11 dígitos.");
		}		
	}
	@Override
	public String getNumero() {
		return null;
	}
}
