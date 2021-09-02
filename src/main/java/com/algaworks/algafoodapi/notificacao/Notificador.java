package com.algaworks.algafoodapi.notificacao;

import com.algaworks.algafoodapi.modelo.Cliente;

public interface Notificador {
    
    void notificar(Cliente cliente, String mensagem);
}
