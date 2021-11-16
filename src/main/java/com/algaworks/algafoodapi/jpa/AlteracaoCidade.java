package com.algaworks.algafoodapi.jpa;

import com.algaworks.algafoodapi.AlgafoodApiApplication;
import com.algaworks.algafoodapi.domain.model.Cidade;
import com.algaworks.algafoodapi.domain.repository.CidadeRepository;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

public class AlteracaoCidade {
    
    public static void main(String[] args) {

        ApplicationContext context = new SpringApplicationBuilder(AlgafoodApiApplication.class)
            .web(WebApplicationType.NONE)
            .run(args);
        
        CidadeRepository cidadeRepository = context.getBean(CidadeRepository.class);

        Cidade cidade = new Cidade();
        cidade.setId(6L);
        cidade.setNome("Maricá");

        cidadeRepository.salvar(cidade);

        System.out.printf("%d - %s\n", cidade.getId(), cidade.getNome());
    }
}
