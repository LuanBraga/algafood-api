package com.algaworks.algafoodapi.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;

import com.algaworks.algafoodapi.domain.model.Permissao;
import com.algaworks.algafoodapi.domain.repository.PermissaoRepository;

import org.springframework.stereotype.Component;

@Component
public class PermissaoRepositoryImpl implements PermissaoRepository{

    private EntityManager manager;

    @Override
    public List<Permissao> listar() {
       return manager.createQuery("from Permissao", Permissao.class).getResultList();
    }

    @Override
    public Permissao buscar(Long id) {
        return manager.find(Permissao.class, id);
    }

    @Override
    public Permissao salvar(Permissao permissao) {
        return manager.merge(permissao);
    }

    @Override
    public void remover(Permissao permissao) {
        permissao = buscar(permissao.getId());
        manager.remove(permissao);
    }
}
