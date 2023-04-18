package org.example.behavioral_patterns.memento;

public class Character {
    private String name;
    private String item;

    public Character(String name){
        this.name = name;
    }

    public void pickUpItem(String item){
        this.item = item;
    }

    public Warehouse putItemInWarehouse(){
        String temp = item;
        item = null;
        return new Warehouse(temp);
    }

    public void pickUpItemFromWarehouse(Warehouse warehouse){
        item = warehouse.getItem();
    }

    public String getName() {
        return name;
    }

    public String getItem() {
        return item;
    }
}
