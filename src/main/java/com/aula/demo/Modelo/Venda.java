package com.aula.demo.Modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "VENDA")
public class Venda implements Serializable {

    @Id
    private Integer id_venda;

    @OneToMany(mappedBy = "pk.vendas")
    @JsonIgnore
    private List<ItensVendas> itensVendas;

    public Venda() {
    }

    public Integer getId_venda() {
        return id_venda;
    }

    public void setId_venda(Integer id_venda) {
        this.id_venda = id_venda;
    }

    public List<ItensVendas> getItensVendas() {
        return itensVendas;
    }

    public void setItensVendas(List<ItensVendas> itensVendas) {
        this.itensVendas = itensVendas;
    }
}
