package com.algaworks.algafoodapi.jpa;

import java.util.List;

import com.algaworks.algafoodapi.AlgafoodApiApplication;
import com.algaworks.algafoodapi.domain.model.FormaPagamento;
import com.algaworks.algafoodapi.domain.repository.FormaPagamentoRepository;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

public class ConsultaFormaPagamentoMain {
    
    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
            .web(WebApplicationType.NONE)
            .run(args);

        FormaPagamentoRepository FormaPagamentoRepository =  applicationContext.getBean(FormaPagamentoRepository.class);

        List<FormaPagamento> formaPagamentos = FormaPagamentoRepository.listar();

        for (FormaPagamento formaPagamento: formaPagamentos){
            System.out.printf(" %s\n", formaPagamento.getDescricao());
        }
    }
}
