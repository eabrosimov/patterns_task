package org.example.structural_patterns.bridge.weapon_impl;

import org.example.structural_patterns.bridge.Weapon;

public class Staff implements Weapon {
    @Override
    public void dealDamage() {
        System.out.println("Посох наносит магический урон");
    }
}
