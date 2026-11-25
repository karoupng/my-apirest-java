package com.example.demomvc.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demomvc.model.Cliente;
import com.example.demomvc.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    // 1. Criar Cliente (POST)
    @PostMapping
    public Cliente criar(@RequestBody Cliente cliente) {
        return repository.save(cliente);
    }

    // 2. Listar todos os Clientes (GET)
    @GetMapping
    public List<Cliente> listarTodos() {
        return repository.findAll();
    }

    // 3. Consultar Cliente por ID (GET /{id})
    @GetMapping("/{id}")
    public Cliente buscarPorId(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    // 4. Apagar Cliente (DELETE /{id})
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}