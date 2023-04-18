package org.example.creational_patterns.factory.race;

import org.example.creational_patterns.factory.GameCharacter;

public class Orc implements GameCharacter {

    @Override
    public void start() {
        System.out.println("Орк стартует в деревне Орков. Территория Шуттгарта");
    }
}
