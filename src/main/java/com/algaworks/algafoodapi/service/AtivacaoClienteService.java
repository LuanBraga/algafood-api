package com.algaworks.algafoodapi.service;

import com.algaworks.algafoodapi.modelo.Cliente;
import com.algaworks.algafoodapi.notificacao.Notificador;

public class AtivacaoClienteService {
    
    private Notificador notificador;

    public AtivacaoClienteService(
        Notificador notificador
    ) {
        this.notificador = notificador;

        System.out.println("AtivacaoClienteService: " + notificador);
    }

    public void ativar(Cliente cliente) {
        cliente.ativar();

        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }
}
