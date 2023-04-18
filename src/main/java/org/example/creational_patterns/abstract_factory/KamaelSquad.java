package org.example.creational_patterns.abstract_factory;

import org.example.creational_patterns.abstract_factory.factory_impl.KamaelFactory;

public class KamaelSquad {
    public static void main(String[] args) {
        AbstractUnitFactory kamaelFactory = new KamaelFactory();

        UnitArcher unitArcher = kamaelFactory.createArcher();
        UnitMage unitMage = kamaelFactory.createMage();
        UnitWarrior unitWarrior = kamaelFactory.createWarrior();

        unitArcher.attackWithBow();
        unitMage.attackWithMagic();
        unitWarrior.attackWithSword();
    }
}
