package com.avanade.decolatech.rh.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.avanade.decolatech.rh.DTO.CargosDTO;
import com.avanade.decolatech.rh.entities.Cargo;

public interface CargoRepository extends JpaRepository<Cargo, Integer>{
	@Query(value="SELECT \r\n"
			+ "	C.ID AS ID,\r\n"
			+ "	A.DESCRICAO AS AREA,\r\n"
			+ "	C.DESCRICAO AS CARGO,\r\n"
			+ "	C.SALARIO AS SALARIO,\r\n"
			+ "	CASE C.TP_SALARIO\r\n"
			+ "		WHEN 1 THEN 'MENSAL'\r\n"
			+ "		WHEN 2 THEN 'POR HORA'\r\n"
			+ "	END AS TIPO\r\n"
			+ " FROM TB_AREAS A INNER JOIN TB_CARGOS C ON A.ID = C.ID_AREA", nativeQuery= true)
	List<CargosDTO> listarCargosDTOs();
}
