package com.algaworks.algafoodapi.notificacao;

import com.algaworks.algafoodapi.modelo.Cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("prod")
@TipoDoNotificador(NivelUrgencia.PROTELAVEL)
@Component
public class NotificadorEmail implements Notificador {

    @Autowired
    private NotificadorProperties properties;

    public NotificadorEmail(){
        System.out.println("produção");
    }

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.println("Host: " + properties.getHostServidor());
        System.out.println("Port: " + properties.getPortaServidor());

        System.out.printf("Notificando %s através do email %s: %s\n", 
        cliente.getNome(), cliente.getEmail(), mensagem);
    }
}
