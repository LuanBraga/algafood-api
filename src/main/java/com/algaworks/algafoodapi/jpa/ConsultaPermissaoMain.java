package com.algaworks.algafoodapi.jpa;

import java.util.List;

import com.algaworks.algafoodapi.AlgafoodApiApplication;
import com.algaworks.algafoodapi.domain.model.Permissao;
import com.algaworks.algafoodapi.domain.repository.PermissaoRepository;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

public class ConsultaPermissaoMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
            .web(WebApplicationType.NONE)
            .run(args);

        PermissaoRepository PermissaoRepository =  applicationContext.getBean(PermissaoRepository.class);

        List<Permissao> permissoes = PermissaoRepository.listar();

        for (Permissao permissao: permissoes){
            System.out.printf(" %s\n", permissao.getDescricao());
        }
    }
}
