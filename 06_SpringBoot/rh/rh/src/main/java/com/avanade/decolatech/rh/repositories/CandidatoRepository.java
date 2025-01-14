package com.avanade.decolatech.rh.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.avanade.decolatech.rh.repositories.CandidatoRepository;

@Service
public class CandidatoRepository {
	@Autowired
	private CandidatoRepository candidatoRepository;
	
	public List<Candidato> listasCandidatos(){
		return candidatoRepository.fundAll();
	}
}