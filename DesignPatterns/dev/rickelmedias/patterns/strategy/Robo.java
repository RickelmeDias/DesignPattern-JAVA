package dev.rickelmedias.patterns.strategy;

public class Robo {
    private Comportamento strategy;

    public Comportamento getStrategy() {
        return strategy;
    }

    public void setStrategy(Comportamento strategy) {
        this.strategy = strategy;
    }

    public void mover() {
        strategy.mover();
    }
}
