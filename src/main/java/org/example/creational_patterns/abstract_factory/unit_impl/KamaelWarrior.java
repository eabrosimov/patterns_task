package org.example.creational_patterns.abstract_factory.unit_impl;

import org.example.creational_patterns.abstract_factory.UnitWarrior;

public class KamaelWarrior implements UnitWarrior {
    @Override
    public void attackWithSword() {
        System.out.println("Камаэль воин бьет двуручным мечём");
    }
}
