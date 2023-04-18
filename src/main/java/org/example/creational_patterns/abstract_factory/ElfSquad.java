package org.example.creational_patterns.abstract_factory;

import org.example.creational_patterns.abstract_factory.factory_impl.ElfFactory;

public class ElfSquad {
    public static void main(String[] args) {
        AbstractUnitFactory elfFactory = new ElfFactory();

        UnitArcher unitArcher = elfFactory.createArcher();
        UnitMage unitMage = elfFactory.createMage();
        UnitWarrior unitWarrior = elfFactory.createWarrior();

        unitArcher.attackWithBow();
        unitMage.attackWithMagic();
        unitWarrior.attackWithSword();


    }
}
