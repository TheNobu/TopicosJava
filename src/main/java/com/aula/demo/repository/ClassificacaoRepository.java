package com.aula.demo.repository;

import com.aula.demo.Modelo.Classificacao;
import com.aula.demo.Modelo.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassificacaoRepository extends JpaRepository<Classificacao,Long> {

}
