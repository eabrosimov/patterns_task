package org.example.structural_patterns.flyweight.monster_drawing_impl;

import org.example.structural_patterns.flyweight.MonsterDrawing;

public class SkeletonDrawing implements MonsterDrawing {
    @Override
    public void drawMonster() {
        System.out.println("Отрисовка скелетона");
    }
}
