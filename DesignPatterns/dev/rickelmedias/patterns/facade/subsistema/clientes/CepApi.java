package dev.rickelmedias.patterns.facade.subsistema.clientes;

import dev.rickelmedias.patterns.singleton.SingletonEager;

public class CepApi {
    private static CepApi instance = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstance() {
        return instance;
    }

    public String recuperarCidade(String cep){
        return "Camboriou";
    }

    public String recuperarEstado(String cep){
        return "SC";
    }
}
