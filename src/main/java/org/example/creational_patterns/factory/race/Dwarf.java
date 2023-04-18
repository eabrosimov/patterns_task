package org.example.creational_patterns.factory.race;

import org.example.creational_patterns.factory.GameCharacter;

public class Dwarf implements GameCharacter {
    @Override
    public void start() {
        System.out.println("Гном стартует в деревне гномов. Территория Шуттгарта");
    }
}
