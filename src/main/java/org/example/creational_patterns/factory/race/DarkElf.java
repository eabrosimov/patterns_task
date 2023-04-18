package org.example.creational_patterns.factory.race;

import org.example.creational_patterns.factory.GameCharacter;

public class DarkElf implements GameCharacter {
    @Override
    public void start() {
        System.out.println("Темный эльф стартует в деревне темных эльфов. Территория Орена");
    }
}
