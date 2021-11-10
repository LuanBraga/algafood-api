package com.algaworks.algafoodapi.jpa;

import java.util.List;

import com.algaworks.algafoodapi.AlgafoodApiApplication;
import com.algaworks.algafoodapi.domain.model.Estado;
import com.algaworks.algafoodapi.domain.repository.EstadoRepository;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

public class ConsultaEstadoMain {
    
    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
            .web(WebApplicationType.NONE)
            .run(args);

        EstadoRepository EstadoRepository =  applicationContext.getBean(EstadoRepository.class);

        List<Estado> Estados = EstadoRepository.listar();

        for (Estado Estado: Estados){
            System.out.printf(" %s\n", Estado.getNome());
        }
    }
}
