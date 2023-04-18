package org.example.behavioral_patterns.strategy.strategy_impl;

import org.example.behavioral_patterns.strategy.Strategy;

public class MeditationStrategy implements Strategy {
    @Override
    public void use() {
        System.out.println("Маг поддержки медитирует. Его мана быстро восстанавливается.\n" +
                            "Во время медитации его броня уменьшается и он не может двигаться");
    }
}
