package com.algaworks.algafoodapi.notificacao;

import com.algaworks.algafoodapi.modelo.Cliente;

import org.springframework.stereotype.Component;

@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorSMS implements Notificador{

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando %s através do número %s: %s\n", 
        cliente.getNome(), cliente.getTelefone(), mensagem); 
    }
    
}
