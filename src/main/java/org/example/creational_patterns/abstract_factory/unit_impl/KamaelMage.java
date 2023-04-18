package org.example.creational_patterns.abstract_factory.unit_impl;

import org.example.creational_patterns.abstract_factory.UnitMage;

public class KamaelMage implements UnitMage {
    @Override
    public void attackWithMagic() {
        System.out.println("Камаэль маг бьет темной магией");
    }
}
