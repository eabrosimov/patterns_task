package org.example.creational_patterns.singleton;

public class Baum {
    private static Baum epicRaidBossBaum;

    private Baum(){
        System.out.println("Баюм возродился в башне дерзости");
    }

    public static Baum getEpicRaidBossBaum(){
        if(epicRaidBossBaum == null){
            epicRaidBossBaum = new Baum();
        }
        return epicRaidBossBaum;
    }

}
