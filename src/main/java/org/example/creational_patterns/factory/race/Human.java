package org.example.creational_patterns.factory.race;

import org.example.creational_patterns.factory.GameCharacter;

public class Human implements GameCharacter {

    @Override
    public void start() {
        System.out.println("Человек стартует в деревне говорящего острова. Территория Глудио");
    }
}
