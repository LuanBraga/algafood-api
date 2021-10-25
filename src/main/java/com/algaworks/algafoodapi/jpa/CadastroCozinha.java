package com.algaworks.algafoodapi.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.algaworks.algafoodapi.domain.model.Cozinha;

import org.springframework.stereotype.Component;

@Component
public class CadastroCozinha {
    
    @PersistenceContext
    private EntityManager manager;

    public List<Cozinha> listar(){
        TypedQuery<Cozinha> query =  manager.createQuery("from Cozinha", Cozinha.class);

        return query.getResultList();
    }
}
