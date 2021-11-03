package com.algaworks.algafoodapi.domain.repository;
import java.util.List;

import com.algaworks.algafoodapi.domain.model.Restaurante;

public interface RestauranteRepository {
    
    List<Restaurante> listar();

    Restaurante buscar(Long id);

    Restaurante salvar(Restaurante Restaurante);

    void remover(Restaurante Restaurante);
}
