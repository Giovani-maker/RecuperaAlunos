package com.edusoft.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edusoft.rest.datasource.model.DTOalunoDados;

public interface AlunoDadosRepository 
		extends JpaRepository<DTOalunoDados, Long>{

}
