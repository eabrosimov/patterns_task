package org.example.creational_patterns.abstract_factory;

public interface AbstractUnitFactory {
    UnitArcher createArcher();
    UnitWarrior createWarrior();
    UnitMage createMage();
}
