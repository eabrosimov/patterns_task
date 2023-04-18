package org.example.creational_patterns.factory;

public class Main {
    public static void main(String[] args) {
        GameCharacterFactory factory = new GameCharacterFactory();

        GameCharacter character1 = factory.createNewCharacter(Race.ELF);
        GameCharacter character2 = factory.createNewCharacter(Race.KAMAEL);

        character1.start();
        character2.start();
    }
}
