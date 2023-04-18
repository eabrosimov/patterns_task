package org.example.structural_patterns.bridge;

import org.example.structural_patterns.bridge.character_impl.Archer;
import org.example.structural_patterns.bridge.weapon_impl.Bow;

public class Main {

    public static void main(String[] args) {
        Weapon weapon = new Bow();
        Character archer = new Archer(weapon);

        archer.attack();
    }
}
