package org.example.behavioral_patterns.strategy.strategy_impl;

import org.example.behavioral_patterns.strategy.Strategy;

public class CombatStrategy implements Strategy {
    @Override
    public void use() {
        System.out.println("Маг поддержки трансформируется в боевую форму и может атаковать магией света\n" +
                            "Он теряет возможность исцелять и бафать");
    }
}
