package org.example.behavioral_patterns.strategy;

public class ElvenElder {
    private Strategy strategy;

    public ElvenElder(Strategy strategy){
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public void transform(){
        strategy.use();
    }
}
