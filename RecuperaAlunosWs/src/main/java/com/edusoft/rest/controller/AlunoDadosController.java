package com.edusoft.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edusoft.rest.datasource.model.DTOaluno;
import com.edusoft.rest.datasource.model.DTOalunoDados;
import com.edusoft.rest.services.BuscarAlunosDadosService;
import com.edusoft.rest.services.BuscarAlunosService;
import com.edusoft.rest.services.CadastroAlunoDadosService;

@RestController
@RequestMapping(value = "/recupera")
public class AlunoDadosController {

	@Autowired
	private CadastroAlunoDadosService serviceCadastro;
	
	@Autowired
	private BuscarAlunosDadosService serviceBuscar;
	
	@PostMapping(path = "alunoDados/save")
	public void alunoDadosSalvar(@RequestBody DTOalunoDados alunoDados) {
		serviceCadastro.cadastro(alunoDados);
	}
	@GetMapping(path = "alunodados/busca")
	public List<DTOalunoDados> buscarAlunoDados() {		
		return serviceBuscar.buscarTodasOsAlunosDados();	
	}
}
