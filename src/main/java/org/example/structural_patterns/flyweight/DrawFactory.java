package org.example.structural_patterns.flyweight;

import org.example.structural_patterns.flyweight.monster_drawing_impl.DragonDrawing;
import org.example.structural_patterns.flyweight.monster_drawing_impl.SkeletonDrawing;
import org.example.structural_patterns.flyweight.monster_drawing_impl.WolfDrawing;

import java.util.HashMap;
import java.util.Map;

public class DrawFactory {
    private Map<Monster, MonsterDrawing> container = new HashMap<>();

    public MonsterDrawing getMonsterDrawing(Monster monster){
        MonsterDrawing monsterDrawing = container.get(monster);

        if(monsterDrawing == null){
            if(monster == Monster.DRAGON) {
                monsterDrawing = new DragonDrawing();
                container.put(monster, monsterDrawing);
            } else if(monster == Monster.SKELETON) {
                monsterDrawing = new SkeletonDrawing();
                container.put(monster, monsterDrawing);
            } else if(monster == Monster.WOLF){
                monsterDrawing = new WolfDrawing();
                container.put(monster, monsterDrawing);
            } else
                throw new IllegalArgumentException();
        }

        return monsterDrawing;
    }
}
