package com.algaworks.algafoodapi.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.algaworks.algafoodapi.domain.model.Cidade;
import com.algaworks.algafoodapi.domain.repository.CidadeRepository;

import org.springframework.stereotype.Component;

@Component
public class CidadeRepositoryImpl implements CidadeRepository{

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Cidade> listar() {
        // TypedQuery<Cidade> query = manager.createQuery("from Restaurante", Cidade.class);
        // return query.getResultList();

        return manager.createQuery("from Cidade", Cidade.class).getResultList();
    }

    @Override
    public Cidade buscar(Long id) {
        return manager.find(Cidade.class, id);
    }

    @Transactional
    @Override
    public Cidade salvar(Cidade Cidade) {
        return manager.merge(Cidade);
    }

    @Transactional
    @Override
    public void remover(Cidade Cidade) {
        manager.remove(Cidade);
        
    }
    
}
