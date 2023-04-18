package org.example.structural_patterns.flyweight;

public class Main {
    public static void main(String[] args) {
        DrawFactory drawFactory = new DrawFactory();
        MonsterDrawing skeletonDrawing1 = drawFactory.getMonsterDrawing(Monster.SKELETON);
        Skeleton skeleton1 = new Skeleton(skeletonDrawing1, 1, 2, 3);
        skeleton1.placeOnMap();

        MonsterDrawing dragonDrawing1 = drawFactory.getMonsterDrawing(Monster.DRAGON);
        Dragon dragon1 = new Dragon(dragonDrawing1, 2, 3, 4);
        dragon1.placeOnMap();

        MonsterDrawing wolfDrawing1 = drawFactory.getMonsterDrawing(Monster.WOLF);
        Wolf wolf1 = new Wolf(wolfDrawing1, 3, 4, 5);
        wolf1.placeOnMap();

        MonsterDrawing skeletonDrawing2 = drawFactory.getMonsterDrawing(Monster.SKELETON);
        Skeleton skeleton2 = new Skeleton(skeletonDrawing1, 4, 5, 6);
        skeleton2.placeOnMap();
    }
}
