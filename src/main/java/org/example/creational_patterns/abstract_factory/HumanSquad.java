package org.example.creational_patterns.abstract_factory;

import org.example.creational_patterns.abstract_factory.factory_impl.HumanFactory;

public class HumanSquad {
    public static void main(String[] args) {
        AbstractUnitFactory humanFactory = new HumanFactory();

        UnitArcher unitArcher = humanFactory.createArcher();
        UnitMage unitMage = humanFactory.createMage();
        UnitWarrior unitWarrior = humanFactory.createWarrior();

        unitArcher.attackWithBow();
        unitMage.attackWithMagic();
        unitWarrior.attackWithSword();
    }
}
