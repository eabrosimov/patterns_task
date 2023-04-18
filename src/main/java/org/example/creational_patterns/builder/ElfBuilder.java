package org.example.creational_patterns.builder;

public class ElfBuilder extends UnitBuilder{
    @Override
    void buildRace() {
        unit.setRace(Race.ELF);
    }

    @Override
    void buildAttack() {
        unit.setAttack(70);
    }

    @Override
    void buildDefence() {
        unit.setDefence(58);
    }

    @Override
    void buildSpeed() {
        unit.setSpeed(22);
    }
}
