package org.example.creational_patterns.abstract_factory.unit_impl;

import org.example.creational_patterns.abstract_factory.UnitWarrior;

public class HumanWarrior implements UnitWarrior {
    @Override
    public void attackWithSword() {
        System.out.println("Человек воин бьет парными мечами");
    }
}
