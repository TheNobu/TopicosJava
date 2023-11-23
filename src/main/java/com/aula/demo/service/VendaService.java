package com.aula.demo.service;

import com.aula.demo.Modelo.Venda;
import com.aula.demo.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendaService {

    @Autowired
    private VendaRepository repository;

    public List<Venda> findAll(){
        return repository.findAll();
    }
}
