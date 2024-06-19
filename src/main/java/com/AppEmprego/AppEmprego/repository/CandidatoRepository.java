package com.AppEmprego.AppEmprego.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.AppEmprego.AppEmprego.models.Candidato;
import com.AppEmprego.AppEmprego.models.Vaga;

public interface CandidatoRepository extends CrudRepository<Candidato, String> {
	
	Iterable<Candidato>findByVaga(Vaga vaga);
	
	Candidato findByRg(String rg);
	
	Candidato findById(long id);
	
	List<Candidato>findByNomeCandidato(String nomeCandidato);
}