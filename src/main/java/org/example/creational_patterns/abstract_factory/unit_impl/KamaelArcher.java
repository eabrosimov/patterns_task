package org.example.creational_patterns.abstract_factory.unit_impl;

import org.example.creational_patterns.abstract_factory.UnitArcher;

public class KamaelArcher implements UnitArcher {
    @Override
    public void attackWithBow() {
        System.out.println("Камаэль арбалетчик стреляет из арбалета");
    }
}
