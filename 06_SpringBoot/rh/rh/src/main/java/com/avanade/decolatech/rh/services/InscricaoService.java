package com.avanade.decolatech.rh.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avanade.decolatech.rh.DTO.CandidatoInscricoesDTO;
import com.avanade.decolatech.rh.DTO.InscricaoDTO;
import com.avanade.decolatech.rh.entities.Candidato;
import com.avanade.decolatech.rh.entities.Cargo;
import com.avanade.decolatech.rh.entities.Inscricao;
import com.avanade.decolatech.rh.repositories.InscricaoRepository;

@Service
public class InscricaoService {

	@Autowired
	private InscricaoRepository inscricaoRepository;
	
	@Autowired
	private CargoService cargoService;
	
	@Autowired
	private CandidatoService candidatoService;
	
	public List<InscricaoDTO> listarInscricoesDTO(){
		return inscricaoRepository.listarInscricoes();
	}
	
	public List<CandidatoInscricoesDTO> listarInscricoesPorCandidatoDTO(){
		return inscricaoRepository.listarInscricoesPorCandidatoDTO();
	}
	
	public List<CandidatoInscricoesDTO> listarInscricoesPorCandidatoDTOByCPF(String cpf){
		return inscricaoRepository.listarInscricoesPorCandidatoDTOByCPF(cpf);
	}
	
	public String efetuarInscricao(Map<String, String> dados) throws ParseException{
		String cpf = dados.get("cpf");
		int id_cargo = Integer.parseInt(dados.get("idCargo"));
		int situacao = Integer.parseInt(dados.get("situacao"));
		String data = dados.get("dataInscricao");
		
		Cargo cargo = cargoService.buscarCargo(id_cargo);
		Candidato candidato = candidatoService.buscarCandidato(cpf);
		
		// convertendo a data para objeto Date
		Date dataInscricao = new SimpleDateFormat("yyyy-MM-dd").parse(data);
		
		Inscricao inscricao = new Inscricao();
		inscricao.setCandidato(candidato);
		inscricao.setCargo(cargo);
		inscricao.setDataInscricao(dataInscricao);
		inscricao.setSituacao(situacao);
		
		inscricaoRepository.save(inscricao);
		
		return "Inscrição realizada!";
		
	}
}
