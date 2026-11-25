package com.example.demomvc.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "PRODUTO")

public class Produto extends AbstractEntity<Long>{
	@Column(name = "nome", nullable = false, length = 100)
	private String nome;
	
	@Column(name = "preco", nullable = false)
	private BigDecimal preco;
	
	@Column(name = "estoque", nullable = false)
	private Boolean estoque;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Boolean getEstoque() {
		return estoque;
	}

	public void setEstoque(Boolean estoque) {
		this.estoque = estoque;
	}
}