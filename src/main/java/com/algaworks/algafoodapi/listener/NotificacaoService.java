package com.algaworks.algafoodapi.listener;

import com.algaworks.algafoodapi.notificacao.NivelUrgencia;
import com.algaworks.algafoodapi.notificacao.Notificador;
import com.algaworks.algafoodapi.notificacao.TipoDoNotificador;
import com.algaworks.algafoodapi.service.ClienteAtivadoEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NotificacaoService {
    
    @TipoDoNotificador(NivelUrgencia.PROTELAVEL)
    @Autowired
    private Notificador notificador;

    @EventListener
    public void clienteAtivadoListener(ClienteAtivadoEvent event) {
        notificador.notificar(event.getCliente(), "Seu Cadastro no sistema está ativo!");
    }
}
