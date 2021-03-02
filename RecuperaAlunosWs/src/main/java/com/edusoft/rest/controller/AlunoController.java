package com.edusoft.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edusoft.rest.datasource.model.DTOaluno;
import com.edusoft.rest.services.BuscarAlunosService;
import com.edusoft.rest.services.CadastroAlunoService;




@RestController
@RequestMapping(value = "/recuperaalunos")
public class AlunoController {

	@Autowired
	private CadastroAlunoService serviceCadastro;
	
	@Autowired
	private BuscarAlunosService serviceBuscar;
	
	@PostMapping(path = "aluno/save")
	public void salvarAluno(@RequestBody DTOaluno aluno) {
		serviceCadastro.cadastro(aluno);
	}
	
	@GetMapping(path = "aluno/busca")
	public List<DTOaluno> buscarAluno() {		
		return serviceBuscar.buscarTodasOsAlunos();	
	}
	
	
}
