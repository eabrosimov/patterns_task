package org.example.creational_patterns.builder;

public class Unit {
    private Race race;
    private int attack;
    private int defence;
    private int speed;

    public void setRace(Race race) {
        this.race = race;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "race=" + race +
                ", attack=" + attack +
                ", defence=" + defence +
                ", speed=" + speed +
                '}';
    }
}
