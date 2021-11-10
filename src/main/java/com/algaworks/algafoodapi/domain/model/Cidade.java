package com.algaworks.algafoodapi.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded =  true)
public class Cidade {
    
    @Id
    @EqualsAndHashCode.Include
    private Long id;

    @Column(nullable = false)
    private String nome;
}
