package com.example.demomvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demomvc.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}