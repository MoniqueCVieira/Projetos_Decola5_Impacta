package com.avanade.decolatech.rh.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.avanade.decolatech.rh.entities.Candidato;

@RestController
@RequestMapping("/candidatos")
public class CandidatoController {
	@GetMapping("/lista")
	public List<Candidato> listar(){
		return null;
	}
}