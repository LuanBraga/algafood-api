package com.algaworks.algafoodapi.notificacao;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("notificador.email")
public class NotificadorProperties {
    
    /**Host do Servidor de e-mail */
    private String hostServidor;

    /**Porta do Servidor de e-mail */
    private Integer portaServidor;

    public String getHostServidor() {
        return hostServidor;
    }

    public Integer getPortaServidor() {
        return portaServidor;
    }

    public void setPortaServidor(Integer portaServidor) {
        this.portaServidor = portaServidor;
    }

    public void setHostServidor(String hostServidor) {
        this.hostServidor = hostServidor;
    }
}
