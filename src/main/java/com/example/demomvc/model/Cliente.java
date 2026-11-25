package com.example.demomvc.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "CLIENTE")

public class Cliente extends AbstractEntity<Long>{
	@Column(name = "nome", nullable = false, length = 100)
	private String nome;
	@Column(name = "clienteDesde", nullable = false,columnDefinition = "DATE" )
	private LocalDate clienteDesde;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getClienteDesde() {
		return clienteDesde;
	}
	public void setClienteDesde(LocalDate clienteDesde) {
		this.clienteDesde = clienteDesde;
	}
	
}
