package com.aula.demo.Controller;

import com.aula.demo.Modelo.Prod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/prod")
public class ControleProduto {

    private final List<Prod> listaProd = new ArrayList<>();

    private Prod p;
    private int id = 1;

    @PostMapping()
    public Prod addProduto(@RequestBody Prod prod){
        p = new Prod();
        p.setCodigo(Long.valueOf(id++));
        p.setDescricao(prod.getDescricao());
        p.setValor(prod.getValor());
        listaProd.add(p);

        return p;
    }
    @GetMapping()
    public List<Prod> listaProduto(){
        return listaProd;
    }
    @GetMapping("/{id}")
    public ResponseEntity<Object> prodCodigo(@PathVariable(value = "id") Long id){
        if(!listaProd.isEmpty()){
            for(Prod p : listaProd) {
                if(p.getCodigo() == id) {
                    return ResponseEntity.status(HttpStatus.OK).body(p);
                }
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não localizado !");
    }
    @PutMapping("/{id}")
    public ResponseEntity<Object> altProd (@PathVariable(value = "id") Long id, @RequestBody Prod prod){
        if(!listaProd.isEmpty()){
            for(Prod p : listaProd) {
                if(p.getCodigo() == id) {
                    p.setDescricao(prod.getDescricao());
                    p.setValor(prod.getValor());
                    return ResponseEntity.status(HttpStatus.OK).body(p);
                }
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não localizado !");
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delProd(@PathVariable(value = "id")Long id){
            if(!listaProd.isEmpty()){
                for (Prod p : listaProd){
                    if(p.getCodigo() == id){
                        listaProd.remove(p);
                        return ResponseEntity.status(HttpStatus.OK).body(p);
                    }
                }
            }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não localizado !");
    }
}
