package com.edusoft.rest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edusoft.rest.datasource.model.DTOalunoDados;
import com.edusoft.rest.repository.AlunoDadosRepository;

@Service
public class BuscarAlunosDadosService {

	@Autowired
	private AlunoDadosRepository alunoDadosRepository;
	
	public List<DTOalunoDados> buscarTodasOsAlunosDados(){
		
		List<DTOalunoDados> listAlunosDados = alunoDadosRepository.findAll();
		
		return listAlunosDados;
	}
}
