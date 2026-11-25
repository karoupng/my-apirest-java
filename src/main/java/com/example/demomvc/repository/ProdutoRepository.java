package com.example.demomvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demomvc.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}