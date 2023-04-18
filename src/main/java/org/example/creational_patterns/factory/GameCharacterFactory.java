package org.example.creational_patterns.factory;

import org.example.creational_patterns.factory.race.*;

public class GameCharacterFactory {
    GameCharacter createNewCharacter(Race race){
        GameCharacter character;
        if(race == Race.HUMAN)
            character = new Human();
        else if(race == Race.ELF)
            character =  new Elf();
        else if(race == Race.DARK_ELF)
            character = new DarkElf();
        else if(race == Race.ORC)
            character = new Orc();
        else if(race == Race.DWARF)
            character = new Dwarf();
        else if(race == Race.KAMAEL)
            character = new Kamael();
        else
            throw new IllegalArgumentException("Такой расы не существует");

        return character;
    }
}
