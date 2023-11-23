package com.aula.demo.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "ITENS_VENDAS")
public class ItensVendas  implements Serializable {
    @EmbeddedId
    private ItensVendasPk pk;
    @Column(name = "QUANTIDADE")
    private BigDecimal quantidade;
    @Column(name = "VALOR")
    private BigDecimal valor;

    public ItensVendas() {
    }

    public ItensVendasPk getPk() {
        return pk;
    }

    public void setPk(ItensVendasPk pk) {
        this.pk = pk;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
