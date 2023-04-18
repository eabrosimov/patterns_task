package org.example.behavioral_patterns.strategy.strategy_impl;

import org.example.behavioral_patterns.strategy.Strategy;

public class SupportStrategy implements Strategy {
    @Override
    public void use() {
        System.out.println("Маг поддержки трансформируется в обычную форму. Теперь он может исцелять и накладывать бафы\n" +
                            "Атакующие скилы недоступны");
    }
}
