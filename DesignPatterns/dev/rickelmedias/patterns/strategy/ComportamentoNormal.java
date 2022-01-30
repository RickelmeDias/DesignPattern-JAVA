package dev.rickelmedias.patterns.strategy;

public class ComportamentoNormal implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Movendo-se Normal!");
    }
}
