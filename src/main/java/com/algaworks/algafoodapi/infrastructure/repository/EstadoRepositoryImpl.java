package com.algaworks.algafoodapi.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.algaworks.algafoodapi.domain.model.Estado;
import com.algaworks.algafoodapi.domain.repository.EstadoRepository;

import org.springframework.stereotype.Component;

@Component
public class EstadoRepositoryImpl implements EstadoRepository{

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Estado> listar() {
        // TypedQuery<Estado> query = manager.createQuery("from Restaurante", Estado.class);
        // return query.getResultList();

        return manager.createQuery("from Estado", Estado.class).getResultList();
    }

    @Override
    public Estado buscar(Long id) {
        return manager.find(Estado.class, id);
    }

    @Transactional
    @Override
    public Estado salvar(Estado estado) {
        return manager.merge(estado);
    }

    @Transactional
    @Override
    public void remover(Estado estado) {
        manager.remove(estado);
        
    }
    
}
