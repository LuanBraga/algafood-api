package com.algaworks.algafoodapi.service;

import com.algaworks.algafoodapi.modelo.Cliente;

public class ClienteAtivadoEvent {
    
    private Cliente cliente;

    public ClienteAtivadoEvent(Cliente cliente) {
        super();
        this.setCliente(cliente);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
