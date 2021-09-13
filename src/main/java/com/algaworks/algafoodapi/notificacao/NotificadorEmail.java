package com.algaworks.algafoodapi.notificacao;

import com.algaworks.algafoodapi.modelo.Cliente;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("prod")
@TipoDoNotificador(NivelUrgencia.PROTELAVEL)
@Component
public class NotificadorEmail implements Notificador {

    public NotificadorEmail(){
        System.out.println("produção");
    }

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando %s através do email %s: %s\n", 
        cliente.getNome(), cliente.getEmail(), mensagem);
    }
}
