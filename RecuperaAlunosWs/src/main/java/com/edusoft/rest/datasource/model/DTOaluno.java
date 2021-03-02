package com.edusoft.rest.datasource.model;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "aluno")
public class DTOaluno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cod;
	
	private int total_aulas;
	private String nome;
	private Double nota1;
	private Double nota2;
	private Double nota3;
	private int faltas1;
	private int faltas2;
	private int faltas3;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}	
	public int getTotal_aulas() {
		return total_aulas;
	}
	public void setTotal_aulas(int total_aulas) {
		this.total_aulas = total_aulas;
	}

	public Long getCod() {
		return cod;
	}
	public void setCod(Long cod) {
		this.cod = cod;
	}
	public Double getNota1() {
		return nota1;
	}
	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}
	public Double getNota2() {
		return nota2;
	}
	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}
	public Double getNota3() {
		return nota3;
	}
	public void setNota3(Double nota3) {
		this.nota3 = nota3;
	}
	public int getFaltas1() {
		return faltas1;
	}
	public void setFaltas1(int faltas1) {
		this.faltas1 = faltas1;
	}
	public int getFaltas2() {
		return faltas2;
	}
	public void setFaltas2(int faltas2) {
		this.faltas2 = faltas2;
	}
	public int getFaltas3() {
		return faltas3;
	}
	public void setFaltas3(int faltas3) {
		this.faltas3 = faltas3;
	}
}
