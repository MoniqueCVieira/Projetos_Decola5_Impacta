package com.avanade.decolatech.rh.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avanade.decolatech.rh.entities.Candidato;

public interface CandidatoRepository extends JpaRepository<Candidato, String>{
	
}
