package com.edusoft.rest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edusoft.rest.datasource.model.DTOaluno;
import com.edusoft.rest.repository.AlunoRepository;


@Service
public class BuscarAlunosService {

	@Autowired
	private AlunoRepository alunoRepository; 
	
	public List<DTOaluno> buscarTodasOsAlunos(){
		
		List<DTOaluno> listAlunos = alunoRepository.findAll();
		
		return listAlunos;
	}
}
