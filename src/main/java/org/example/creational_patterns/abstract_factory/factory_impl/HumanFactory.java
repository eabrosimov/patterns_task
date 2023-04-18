package org.example.creational_patterns.abstract_factory.factory_impl;

import org.example.creational_patterns.abstract_factory.AbstractUnitFactory;
import org.example.creational_patterns.abstract_factory.UnitArcher;
import org.example.creational_patterns.abstract_factory.UnitMage;
import org.example.creational_patterns.abstract_factory.UnitWarrior;
import org.example.creational_patterns.abstract_factory.unit_impl.HumanArcher;
import org.example.creational_patterns.abstract_factory.unit_impl.HumanMage;
import org.example.creational_patterns.abstract_factory.unit_impl.HumanWarrior;

public class HumanFactory implements AbstractUnitFactory {
    @Override
    public UnitArcher createArcher() {
        return new HumanArcher();
    }

    @Override
    public UnitWarrior createWarrior() {
        return new HumanWarrior();
    }

    @Override
    public UnitMage createMage() {
        return new HumanMage();
    }
}
