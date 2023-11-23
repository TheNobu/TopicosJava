package com.aula.demo.service;

import com.aula.demo.Modelo.Classificacao;
import com.aula.demo.Modelo.Produto;
import com.aula.demo.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository repository;

    public Produto addProduto(Produto produto){
        return repository.save(produto);
    }
    public List<Produto> findAll(){
        return repository.findAll();
    }
    public Optional<Produto> findById(Long codigo){
        return repository.findById(codigo);
    }
    public List<Produto> findByClassificacao003() {
        List<Produto> prod = repository.findAll();
        List<Produto> prodFilter = new ArrayList<Produto>();
        prod.forEach(produto -> {
            if(!produto.getUnidade().equalsIgnoreCase("UN") && produto.getClassificacao().getCodigo().equalsIgnoreCase("003")){
                prodFilter.add(produto);
            }
        } );
        return prodFilter;
    }

//    public List<Produto> findByClassificacao003MedidaUn() {
//        List<Produto> prod = repository.findAll();
//        List<Produto> prodFilter = new ArrayList<Produto>();
//        prod.forEach(produto -> {
//            if(produto.getUnidade().equalsIgnoreCase("UN") && produto.getClassificacao().getCodigo().equalsIgnoreCase("003") &&  produto.getQuantidade()  &&  produto.getQuantidade()  && produto.getValor() < 10){
//                prodFilter.add(produto);
//            }
//        } );
//        return prodFilter;
//    }



}
