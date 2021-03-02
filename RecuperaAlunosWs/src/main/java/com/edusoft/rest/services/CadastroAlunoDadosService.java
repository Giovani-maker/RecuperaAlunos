package com.edusoft.rest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.edusoft.rest.datasource.model.DTOalunoDados;
import com.edusoft.rest.repository.AlunoDadosRepository;

@Service
public class CadastroAlunoDadosService {

	@Autowired
	private AlunoDadosRepository alunoDadosRepositor;

	
	public void cadastro(DTOalunoDados alunoDados) {

		alunoDadosRepositor.saveAndFlush(alunoDados);
	}
}
