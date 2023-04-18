package org.example.structural_patterns.сomposite.member_impl;

import org.example.structural_patterns.сomposite.Member;
import org.example.structural_patterns.сomposite.Type;

public class Soldier implements Member {
    private String name;
    private Type type;
    private int strength;

    public Soldier(String name){
        this.name = name;
        type = Type.SOLDIER;
        strength = 1;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    @Override
    public int getStrength() {
        return strength;
    }
}
