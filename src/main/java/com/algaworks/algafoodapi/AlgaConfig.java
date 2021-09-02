package com.algaworks.algafoodapi;

import com.algaworks.algafoodapi.notificacao.NotificadorEmail;
import com.algaworks.algafoodapi.service.AtivacaoClienteService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AlgaConfig {
    
    @Bean
    public NotificadorEmail notificadorEmail() {
        NotificadorEmail notificador = new NotificadorEmail("smtp.algamail.com.br");
        notificador.setCaixaAlta(true);

        return notificador;
    }

    @Bean
    public AtivacaoClienteService ativacaoClienteService() {
        return new AtivacaoClienteService(notificadorEmail());
    }
}
