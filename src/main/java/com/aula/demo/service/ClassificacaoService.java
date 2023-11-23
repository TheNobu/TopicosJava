package com.aula.demo.service;

import com.aula.demo.Modelo.Classificacao;
import com.aula.demo.Modelo.Produto;
import com.aula.demo.repository.ClassificacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClassificacaoService {

    @Autowired
    private ClassificacaoRepository repository;

    public Classificacao addProduto(Classificacao classificacao){
        return repository.save(classificacao);
    }
    public List<Classificacao> findAll(){
        return repository.findAll();
    }


}
