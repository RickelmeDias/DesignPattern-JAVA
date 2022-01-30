package dev.rickelmedias.patterns.facade.subsistema.cep;

public class ClienteService {
    private ClienteService () {
        super();
    }

    public static void graverCliente(String nome, String cep, String estado) {
    System.out.println("Cliente salvo com sucesso");
    }
}
