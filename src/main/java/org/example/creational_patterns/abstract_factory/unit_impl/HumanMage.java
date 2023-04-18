package org.example.creational_patterns.abstract_factory.unit_impl;

import org.example.creational_patterns.abstract_factory.UnitMage;

public class HumanMage implements UnitMage {
    @Override
    public void attackWithMagic() {
        System.out.println("Человек маг бьет магией огня");
    }
}
