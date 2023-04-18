package org.example.behavioral_patterns.memento;

public class Warehouse {
    private final String item;

    public Warehouse(String item) {
        this.item = item;
    }

    public String getItem() {
        return item;
    }
}
