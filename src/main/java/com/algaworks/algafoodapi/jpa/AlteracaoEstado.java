package com.algaworks.algafoodapi.jpa;

import com.algaworks.algafoodapi.AlgafoodApiApplication;
import com.algaworks.algafoodapi.domain.model.Estado;
import com.algaworks.algafoodapi.domain.repository.EstadoRepository;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

public class AlteracaoEstado {
    
    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
            .web(WebApplicationType.NONE)
            .run(args);

        EstadoRepository estadoRepository =  applicationContext.getBean(EstadoRepository.class);

        Estado estado = new Estado();
        // estado.setId(1L);
        estado.setNome("Piauí");

        estado =  estadoRepository.salvar(estado);

        System.out.printf("%d - %s\n", estado.getId(), estado.getNome());
    }
}
