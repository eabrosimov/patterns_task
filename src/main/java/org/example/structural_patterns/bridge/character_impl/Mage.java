package org.example.structural_patterns.bridge.character_impl;

import org.example.structural_patterns.bridge.Character;
import org.example.structural_patterns.bridge.Weapon;

public class Mage extends Character {
    public Mage(Weapon weapon){
        super(weapon);
    }
    @Override
    protected void attack() {
        System.out.println("Маг атакует");
        weapon.dealDamage();
    }
}
