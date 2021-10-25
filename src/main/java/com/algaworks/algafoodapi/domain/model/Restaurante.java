package com.algaworks.algafoodapi.domain.model;

import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Restaurante {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nome;

    @Column
    private BigDecimal taxaFrete;


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getTaxaFrete() {
        return this.taxaFrete;
    }

    public void setTaxaFrete(BigDecimal taxaFrete) {
        this.taxaFrete = taxaFrete;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Restaurante)) {
            return false;
        }
        Restaurante restaurante = (Restaurante) o;
        return id == restaurante.id && Objects.equals(nome, restaurante.nome) && Objects.equals(taxaFrete, restaurante.taxaFrete);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, taxaFrete);
    }

}
