package org.example.creational_patterns.builder;

public class HumanBuilder extends UnitBuilder{
    @Override
    void buildRace() {
        unit.setRace(Race.HUMAN);
    }

    @Override
    void buildAttack() {
        unit.setAttack(100);
    }

    @Override
    void buildDefence() {
        unit.setDefence(50);
    }

    @Override
    void buildSpeed() {
        unit.setSpeed(20);
    }
}
