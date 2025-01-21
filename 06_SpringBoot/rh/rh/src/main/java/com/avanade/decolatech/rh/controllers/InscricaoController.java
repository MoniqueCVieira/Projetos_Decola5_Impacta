package com.avanade.decolatech.rh.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avanade.decolatech.rh.DTO.CandidatoInscricoesDTO;
import com.avanade.decolatech.rh.DTO.InscricaoDTO;
import com.avanade.decolatech.rh.entities.Inscricao;
import com.avanade.decolatech.rh.services.InscricaoService;

@RestController
@RequestMapping("/inscricoes")
public class InscricaoController {
	
	@Autowired
	private InscricaoService inscricaoService;
	
	@GetMapping("/lista")
	public ResponseEntity<List<InscricaoDTO>> listar(){
		return new ResponseEntity<List<InscricaoDTO>>(inscricaoService.listarInscricoesDTO(), HttpStatus.OK);
	}
	
	@GetMapping({"/candidatos", "/candidatos/{cpf}"})
	public ResponseEntity<List<CandidatoInscricoesDTO>> listarInscricoesPorCandidato(@PathVariable(name = "cpf", required = false) String cpf){
		
		if(cpf == null) {
			return new ResponseEntity<List<CandidatoInscricoesDTO>>(inscricaoService.listarInscricoesPorCandidatoDTO(), HttpStatus.OK);
		}else {
			return new ResponseEntity<List<CandidatoInscricoesDTO>>(inscricaoService.listarInscricoesPorCandidatoDTOByCPF(cpf), HttpStatus.OK);
		}
	}
	
	@PostMapping("/incluir")
	public ResponseEntity<String> incluir(@RequestBody Map<String, String> dados){
		try {
			return new ResponseEntity<String>(inscricaoService.efetuarInscricao(dados), HttpStatus.CREATED);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
/*	@GetMapping("/candidatos")
	public ResponseEntity<List<CandidatoInscricoesDTO>> listarInscricoesPorCandidato(){
		return new ResponseEntity<List<CandidatoInscricoesDTO>>(inscricaoService.listarInscricoesPorCandidatoDTO(), HttpStatus.OK);
	}
	
	@GetMapping("/candidatos/{cpf}")
	public ResponseEntity<List<CandidatoInscricoesDTO>> listarInscricoesPorCandidatoByCPF(@PathVariable("cpf") String cpf){
		return new ResponseEntity<List<CandidatoInscricoesDTO>>(inscricaoService.listarInscricoesPorCandidatoDTOByCPF(cpf), HttpStatus.OK);
	}*/
	
}
