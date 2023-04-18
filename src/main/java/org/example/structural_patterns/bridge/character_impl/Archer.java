package org.example.structural_patterns.bridge.character_impl;

import org.example.structural_patterns.bridge.Character;
import org.example.structural_patterns.bridge.Weapon;

public class Archer extends Character {
    public Archer(Weapon weapon){
        super(weapon);
    }

    @Override
    protected void attack() {
        System.out.println("Лучник атакует");
        weapon.dealDamage();
    }
}
