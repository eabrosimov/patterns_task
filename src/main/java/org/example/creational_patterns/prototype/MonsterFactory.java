package org.example.creational_patterns.prototype;

import org.example.creational_patterns.prototype.copyable_impl.Monster;

public class MonsterFactory {
    Monster monster;

    public MonsterFactory(Monster monster){
        this.monster = monster;
    }

    public Monster returnCopy(){
        return (Monster) monster.copy();
    }
}
