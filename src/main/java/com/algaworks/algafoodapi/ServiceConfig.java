package com.algaworks.algafoodapi;

import com.algaworks.algafoodapi.notificacao.NotificadorEmail;
import com.algaworks.algafoodapi.service.AtivacaoClienteService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
    @Bean
    public AtivacaoClienteService ativacaoClienteService(NotificadorEmail notificadorEmail) {
        return new AtivacaoClienteService(notificadorEmail);
    }    
}
