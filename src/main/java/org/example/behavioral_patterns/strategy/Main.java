package org.example.behavioral_patterns.strategy;

import org.example.behavioral_patterns.strategy.strategy_impl.CombatStrategy;
import org.example.behavioral_patterns.strategy.strategy_impl.MeditationStrategy;
import org.example.behavioral_patterns.strategy.strategy_impl.SupportStrategy;

public class Main {

    public static void main(String[] args) {
        ElvenElder elvenElder = new ElvenElder(new SupportStrategy());
        elvenElder.transform();
        System.out.println("==================");
        elvenElder.setStrategy(new MeditationStrategy());
        elvenElder.transform();
        System.out.println("==================");
        elvenElder.setStrategy(new CombatStrategy());
        elvenElder.transform();
    }
}
