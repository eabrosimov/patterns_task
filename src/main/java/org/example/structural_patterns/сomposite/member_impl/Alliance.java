package org.example.structural_patterns.сomposite.member_impl;

import org.example.structural_patterns.сomposite.Member;
import org.example.structural_patterns.сomposite.Type;

import java.util.ArrayList;
import java.util.List;

public class Alliance implements Member {
    private String name;
    private Type type;
    private List<Clan> clans;
    private int strength;

    public Alliance(String name){
        this.name = name;
        clans = new ArrayList<>();
        type = Type.ALLIANCE;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public List<Clan> getClans() {
        return clans;
    }

    public void addClan(Clan clan){
        clans.add(clan);
    }

    public void removeClan(Clan clan){
        clans.remove(clan);
    }

    @Override
    public int getStrength() {
        for(Clan c: clans){
            strength += c.getStrength();
        }
        return strength;
    }
}
