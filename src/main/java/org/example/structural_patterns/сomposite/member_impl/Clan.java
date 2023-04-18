package org.example.structural_patterns.сomposite.member_impl;

import org.example.structural_patterns.сomposite.Member;
import org.example.structural_patterns.сomposite.Type;

import java.util.ArrayList;
import java.util.List;

public class Clan implements Member {
    private String name;
    private Type type;
    private List<Soldier> soldiers;
    private int strength;

    public Clan(String name){
        this.name = name;
        soldiers = new ArrayList<>();
        type = Type.CLAN;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public List<Soldier> getSoldiers() {
        return soldiers;
    }

    public void addParty(Soldier soldier){
        soldiers.add(soldier);
    }

    public void removeParty(Soldier soldier){
        soldiers.remove(soldier);
    }

    @Override
    public int getStrength() {
        for(Soldier p: soldiers){
            strength += p.getStrength();
        }
        return strength;
    }
}
