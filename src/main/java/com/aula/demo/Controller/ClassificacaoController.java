package com.aula.demo.Controller;

import com.aula.demo.Modelo.Classificacao;
import com.aula.demo.Modelo.Produto;
import com.aula.demo.service.ClassificacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/classificacao")
public class ClassificacaoController {
    @Autowired
    private ClassificacaoService service;

    @PostMapping
    public ResponseEntity<Object> addProduto(@RequestBody Classificacao classificacao){
        return ResponseEntity.status(HttpStatus.OK).body(service.addProduto(classificacao));
    }
    @GetMapping
    public ResponseEntity<List<Classificacao>> listAllProd(){
        return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
    }
}
