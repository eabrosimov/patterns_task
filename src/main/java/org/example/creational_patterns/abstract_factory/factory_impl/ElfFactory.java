package org.example.creational_patterns.abstract_factory.factory_impl;

import org.example.creational_patterns.abstract_factory.AbstractUnitFactory;
import org.example.creational_patterns.abstract_factory.UnitArcher;
import org.example.creational_patterns.abstract_factory.UnitMage;
import org.example.creational_patterns.abstract_factory.UnitWarrior;
import org.example.creational_patterns.abstract_factory.unit_impl.ElfArcher;
import org.example.creational_patterns.abstract_factory.unit_impl.ElfMage;
import org.example.creational_patterns.abstract_factory.unit_impl.ElfWarrior;

public class ElfFactory implements AbstractUnitFactory {
    @Override
    public UnitArcher createArcher() {
        return new ElfArcher();
    }

    @Override
    public UnitWarrior createWarrior() {
        return new ElfWarrior();
    }

    @Override
    public UnitMage createMage() {
        return new ElfMage();
    }
}
