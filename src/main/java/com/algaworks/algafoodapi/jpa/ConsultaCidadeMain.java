package com.algaworks.algafoodapi.jpa;

import java.util.List;

import com.algaworks.algafoodapi.AlgafoodApiApplication;
import com.algaworks.algafoodapi.domain.model.Cidade;
import com.algaworks.algafoodapi.domain.repository.CidadeRepository;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

public class ConsultaCidadeMain {
    
    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
            .web(WebApplicationType.NONE)
            .run(args);

        CidadeRepository CidadeRepository =  applicationContext.getBean(CidadeRepository.class);

        List<Cidade> Cidades = CidadeRepository.listar();

        for (Cidade Cidade: Cidades){
            System.out.printf(" %s\n", Cidade.getNome());
        }
    }
}
