package com.aula.demo.Controller;

import com.aula.demo.Modelo.Produto;
import com.aula.demo.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("produto")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @PostMapping
    public ResponseEntity<Object> addProduto(@RequestBody Produto produto){
        return ResponseEntity.status(HttpStatus.OK).body(service.addProduto(produto));
    }
    @GetMapping("/all")
    public ResponseEntity<List<Produto>> listAllProd(){
        return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
    }
    @GetMapping("/003")
    public ResponseEntity<List<Produto>> listAllProd003(){
        return ResponseEntity.status(HttpStatus.OK).body(service.findByClassificacao003());
    }

    @GetMapping("/codigo/{codigo}")
    public ResponseEntity<Optional<Produto>> findById(@PathVariable(value = "codigo")Long codigo){
        return ResponseEntity.status(HttpStatus.OK).body(service.findById(codigo));
    }

}
