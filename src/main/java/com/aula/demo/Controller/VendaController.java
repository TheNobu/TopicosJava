package com.aula.demo.Controller;

import com.aula.demo.Modelo.Venda;
import com.aula.demo.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/venda")
public class VendaController {
    @Autowired
    private VendaService service;

    @GetMapping
    public ResponseEntity<List<Venda>> listAll(){
        return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
    }
}
