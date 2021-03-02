package com.edusoft.rest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edusoft.rest.datasource.model.DTOaluno;
import com.edusoft.rest.repository.AlunoRepository;


@Service
public class CadastroAlunoService {
	
	@Autowired
	private AlunoRepository alunoRs;
	
	public void cadastro(DTOaluno aluno) {
		alunoRs.saveAndFlush(aluno);
	}
}
