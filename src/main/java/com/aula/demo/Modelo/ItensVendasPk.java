package com.aula.demo.Modelo;

import jakarta.persistence.Embeddable;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;
@Embeddable
public class ItensVendasPk implements Serializable {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_VENDA")
    private Venda venda;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CODIGO")
    private Produto produto;

    public ItensVendasPk() {
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
