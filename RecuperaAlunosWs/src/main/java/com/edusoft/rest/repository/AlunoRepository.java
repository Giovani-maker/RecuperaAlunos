package com.edusoft.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edusoft.rest.datasource.model.DTOaluno;

public interface AlunoRepository 
		extends JpaRepository<DTOaluno, Long>{

}
