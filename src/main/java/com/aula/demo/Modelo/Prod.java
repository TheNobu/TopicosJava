package com.aula.demo.Modelo;

public class Prod {

    private String descricao;
    private double valor;
    private Long codigo;

    public Prod(String descricao, double valor, Long codigo) {
        this.descricao = descricao;
        this.valor = valor;
        this.codigo = codigo;
    }

    public Prod(){

    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
}



