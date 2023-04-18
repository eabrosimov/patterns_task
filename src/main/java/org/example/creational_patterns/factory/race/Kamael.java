package org.example.creational_patterns.factory.race;

import org.example.creational_patterns.factory.GameCharacter;

public class Kamael implements GameCharacter {

    @Override
    public void start() {
        System.out.println("Камаэль стартует в деревне камаэлей. Территория Адена");
    }
}
