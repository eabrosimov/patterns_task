package org.example.creational_patterns.factory.race;

import org.example.creational_patterns.factory.GameCharacter;

public class Elf implements GameCharacter {
    @Override
    public void start() {
        System.out.println("Светлый эльф стартует в деревне светлых эльфов. Территория Орена");
    }
}
