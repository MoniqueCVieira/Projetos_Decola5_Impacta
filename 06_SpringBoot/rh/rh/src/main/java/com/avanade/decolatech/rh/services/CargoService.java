package com.avanade.decolatech.rh.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avanade.decolatech.rh.DTO.CargosDTO;
import com.avanade.decolatech.rh.DTO.NovoCargoDTO;
import com.avanade.decolatech.rh.entities.Area;
import com.avanade.decolatech.rh.entities.Cargo;
import com.avanade.decolatech.rh.repositories.CargoRepository;

@Service
public class CargoService {
	@Autowired
	private CargoRepository cargoRepository;
	@Autowired
	private AreaService areaService;
	
	public Cargo incluirCargo(NovoCargoDTO dto) {
		Area area = areaService.buscarArea(dto.getIdArea());
		
		Cargo cargo = new Cargo();
		cargo.setDescricao(dto.getDescricao());
		cargo.setSalario(dto.getSalario());
		cargo.setTipoSalario(dto.getTipoSalario());
		cargo.setArea(area);
		
		return cargoRepository.save(cargo);
	}
	
	public List<CargosDTO> listarCargosDTOs(){
		return cargoRepository.listarCargosDTOs();
	}
	
	public Cargo buscarCargo(int id) {
		Cargo cargo = cargoRepository.getReferenceById(id);
		
		Cargo novo = new Cargo(cargo.getId(), cargo.getSalario(), cargo.getTipoSalario());
		novo.setArea(areaService.buscarArea(novo.getArea().getId()));
		
		return cargoRepository.save(novo);
	}
}
