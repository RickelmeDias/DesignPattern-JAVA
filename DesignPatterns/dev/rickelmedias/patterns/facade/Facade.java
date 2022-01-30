package dev.rickelmedias.patterns.facade;

import dev.rickelmedias.patterns.facade.subsistema.cep.ClienteService;
import dev.rickelmedias.patterns.facade.subsistema.clientes.CepApi;

public class Facade {
    public void migrarCLiente(String nome, String cep) {
        CepApi api = CepApi.getInstance();
        String cidade = api.recuperarCidade(cep);
        String estado = api.recuperarEstado(cep);

        ClienteService.graverCliente(nome, cidade, estado);
    }
}
