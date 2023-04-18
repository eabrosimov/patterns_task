package org.example.structural_patterns.bridge.weapon_impl;

import org.example.structural_patterns.bridge.Weapon;

public class Bow implements Weapon {
    @Override
    public void dealDamage() {
        System.out.println("Лук наносит критический урон");
    }
}
