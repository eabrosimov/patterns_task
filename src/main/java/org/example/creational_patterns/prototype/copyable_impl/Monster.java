package org.example.creational_patterns.prototype.copyable_impl;

import org.example.creational_patterns.prototype.Copyable;

public class Monster implements Copyable {
    private String name;
    private String location;
    private int attack;
    private int defence;
    private int speed;

    public Monster(String name, String location, int attack, int defence, int speed) {
        this.name = name;
        this.location = location;
        this.attack = attack;
        this.defence = defence;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    @Override
    public Object copy() {
        return new Monster(name, location, attack, defence, speed);
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", attack=" + attack +
                ", defence=" + defence +
                ", speed=" + speed +
                '}';
    }
}
