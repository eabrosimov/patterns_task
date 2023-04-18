package org.example.creational_patterns.builder;

public class Director {
    UnitBuilder builder;

    public void setBuilder(UnitBuilder unitBuilder){
        this.builder = unitBuilder;
    }

    public Unit build(){
        builder.createUnit();
        builder.buildRace();
        builder.buildAttack();
        builder.buildDefence();
        builder.buildSpeed();

        Unit unit = builder.getUnit();

        return unit;
    }

}
