package com.avanade.decolatech.rh.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avanade.decolatech.rh.DTO.CargosDTO;
import com.avanade.decolatech.rh.DTO.NovoCargoDTO;
import com.avanade.decolatech.rh.entities.Cargo;
import com.avanade.decolatech.rh.services.CargoService;

@RestController
@RequestMapping("/cargos")
public class CargoController {
	
	@Autowired
	private CargoService cargoService;
	
	@GetMapping("/lista")
	public ResponseEntity<List<CargosDTO>> listar(){
		return new ResponseEntity<List<CargosDTO>>(cargoService.listarCargosDTOs(), HttpStatus.OK);
	}
	
	@PostMapping("/novo")
	public ResponseEntity<Cargo> incluir(@RequestBody NovoCargoDTO dto){
		try {
			return new ResponseEntity<Cargo>(cargoService.incluirCargo(dto), HttpStatus.CREATED);
		}catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
