package com.algaworks.algafoodapi.service;

import com.algaworks.algafoodapi.modelo.Cliente;
import com.algaworks.algafoodapi.notificacao.NivelUrgencia;
import com.algaworks.algafoodapi.notificacao.Notificador;
import com.algaworks.algafoodapi.notificacao.TipoDoNotificador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {
    
    @TipoDoNotificador(NivelUrgencia.PROTELAVEL)
    @Autowired(required = false)
    private Notificador notificador;

    public void ativar(Cliente cliente) {
        cliente.ativar();

        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }
}

