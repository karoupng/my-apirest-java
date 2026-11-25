package com.example.demomvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demomvc.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
