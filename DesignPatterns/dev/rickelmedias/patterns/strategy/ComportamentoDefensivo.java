package dev.rickelmedias.patterns.strategy;

public class ComportamentoDefensivo implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Movendo-se Defensivo!");
    }
}
