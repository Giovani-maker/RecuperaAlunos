package com.edusoft.rest.datasource.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;

@Entity
@Table(name = "media_frequencia")
public class DTOalunoDados {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private double media;
	private double frequencia;
	private String situacao;

	private Long idAluno;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}
	public double getFrequencia() {
		return frequencia;
	}
	public void setFrequencia(double frequencia) {
		this.frequencia = frequencia;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public Long getIdAluno() {
		return idAluno;
	}
	public void setIdAluno(Long idAluno) {
		this.idAluno = idAluno;
	}
	@Override
	public String toString() {
		return "DTOalunoDados [id=" + id + ", media=" + media + ", frequencia=" + frequencia + ", situacao=" + situacao
				+ "]";
	}
	
	

	
	
	
}
