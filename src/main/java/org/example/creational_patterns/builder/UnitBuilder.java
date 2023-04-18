package org.example.creational_patterns.builder;

public abstract class UnitBuilder {
    Unit unit;

    void createUnit(){
        unit = new Unit();
    }

    abstract void buildRace();
    abstract void buildAttack();
    abstract void buildDefence();
    abstract void buildSpeed();

    Unit getUnit(){
        return unit;
    }

}
