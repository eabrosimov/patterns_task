package org.example.structural_patterns.bridge.character_impl;

import org.example.structural_patterns.bridge.Character;
import org.example.structural_patterns.bridge.Weapon;

public class Warrior extends Character {
    public Warrior(Weapon weapon){
        super(weapon);
    }

    @Override
    protected void attack() {
        System.out.println("Воин атакует");
        weapon.dealDamage();
    }
}
