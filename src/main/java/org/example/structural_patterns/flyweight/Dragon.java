package org.example.structural_patterns.flyweight;

public class Dragon {
    private MonsterDrawing monsterDrawing;
    private int xPos;
    private int yPos;
    private int zPos;

    public Dragon(MonsterDrawing monsterDrawing, int xPos, int yPos, int zPos){
        this.monsterDrawing = monsterDrawing;
        this.xPos = xPos;
        this.yPos = yPos;
        this.zPos = zPos;
    }

    public void placeOnMap(){
        System.out.printf("Определяется точка респавна по координатам %d, %d, %d\n", xPos, yPos, zPos);
        monsterDrawing.drawMonster();
        System.out.println();
    }
}
