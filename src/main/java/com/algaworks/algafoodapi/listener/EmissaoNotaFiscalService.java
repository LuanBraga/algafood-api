package com.algaworks.algafoodapi.listener;

import com.algaworks.algafoodapi.service.ClienteAtivadoEvent;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EmissaoNotaFiscalService {
    
    @EventListener
    public void clienteAtivadoListener(ClienteAtivadoEvent event) {
        System.out.println("Emitindo nota fiscal para o cliente " + event.getCliente().getNome());
    }
}
