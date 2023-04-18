package org.example.creational_patterns.abstract_factory.factory_impl;

import org.example.creational_patterns.abstract_factory.AbstractUnitFactory;
import org.example.creational_patterns.abstract_factory.UnitArcher;
import org.example.creational_patterns.abstract_factory.UnitMage;
import org.example.creational_patterns.abstract_factory.UnitWarrior;
import org.example.creational_patterns.abstract_factory.unit_impl.KamaelArcher;
import org.example.creational_patterns.abstract_factory.unit_impl.KamaelMage;
import org.example.creational_patterns.abstract_factory.unit_impl.KamaelWarrior;

public class KamaelFactory implements AbstractUnitFactory {
    @Override
    public UnitArcher createArcher() {
        return new KamaelArcher();
    }

    @Override
    public UnitWarrior createWarrior() {
        return new KamaelWarrior();
    }

    @Override
    public UnitMage createMage() {
        return new KamaelMage();
    }
}
