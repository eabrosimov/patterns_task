package org.example.structural_patterns.bridge;

public abstract class Character {
    protected Weapon weapon;

    public Character(Weapon weapon){
        this.weapon = weapon;
    }

    protected abstract void attack();
}
