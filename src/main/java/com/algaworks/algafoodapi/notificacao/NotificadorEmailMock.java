package com.algaworks.algafoodapi.notificacao;

import com.algaworks.algafoodapi.modelo.Cliente;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("dev")
@TipoDoNotificador(NivelUrgencia.PROTELAVEL)
@Component
public class NotificadorEmailMock implements Notificador {

    public NotificadorEmailMock(){
        System.out.println("desenvolvimento");
    }

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Mock: Notificando %s através do email %s: %s\n", 
        cliente.getNome(), cliente.getEmail(), mensagem);
    }
}
