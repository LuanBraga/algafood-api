package com.algaworks.algafoodapi.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import com.algaworks.algafoodapi.domain.model.Restaurante;
import com.algaworks.algafoodapi.domain.repository.RestauranteRepository;

import org.springframework.stereotype.Component;

@Component
public class RestauranteRepositoryImpl implements RestauranteRepository{

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Restaurante> listar(){
        TypedQuery<Restaurante> query =  manager.createQuery("from Restaurante", Restaurante.class);
        return query.getResultList();
    }

    @Override
    public Restaurante buscar(Long i) {
        return manager.find(Restaurante.class, i);
    }

    @Transactional
    @Override
    public Restaurante salvar(Restaurante Restaurante) {
       return manager.merge(Restaurante);
    }

    @Transactional
    @Override
    public void remover(Restaurante Restaurante) {
        Restaurante = buscar(Restaurante.getId());
        manager.remove(Restaurante);
    }
    
}
