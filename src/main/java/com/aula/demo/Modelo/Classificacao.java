package com.aula.demo.Modelo;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "classificacao")
public class Classificacao implements Serializable {
    @Id
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "DESCRICAO")
    private String decricao;

    public Classificacao() {
    }
    @OneToMany(mappedBy = "classificacao")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<Produto> produtos;
    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDecricao() {
        return decricao;
    }

    public void setDecricao(String decricao) {
        this.decricao = decricao;
    }
}
