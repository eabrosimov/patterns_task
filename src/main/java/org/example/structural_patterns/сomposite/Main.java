package org.example.structural_patterns.сomposite;

import org.example.structural_patterns.сomposite.member_impl.Alliance;
import org.example.structural_patterns.сomposite.member_impl.Clan;
import org.example.structural_patterns.сomposite.member_impl.Soldier;

public class Main {
    public static void main(String[] args) {
        Alliance alliance1 = new Alliance("RoA");
        Clan clan1 = new Clan("Lions");
        Clan clan2 = new Clan("Dragons");

        alliance1.addClan(clan1);
        alliance1.addClan(clan2);

        for(int i = 0; i < 10; i++){
            clan1.addParty(new Soldier("" + i));
        }

        for(int i = 0; i < 15; i++){
            clan2.addParty(new Soldier("" + i));
        }

        Alliance alliance2 = new Alliance("Epic");
        Clan clan3 = new Clan("Swarog");
        Clan clan4 = new Clan("Blade");

        alliance2.addClan(clan3);
        alliance2.addClan(clan4);

        for(int i = 0; i < 8; i++){
            clan3.addParty(new Soldier("" + i));
        }

        for(int i = 0; i < 12; i++){
            clan4.addParty(new Soldier("" + i));
        }

        System.out.println(alliance1.getStrength());
        System.out.println(alliance2.getStrength());

    }

}
