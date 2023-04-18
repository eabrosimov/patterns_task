package org.example.creational_patterns.abstract_factory.unit_impl;

import org.example.creational_patterns.abstract_factory.UnitWarrior;

public class ElfWarrior implements UnitWarrior {
    @Override
    public void attackWithSword() {
        System.out.println("Эльф воин бьет одноручным мечём");
    }
}
