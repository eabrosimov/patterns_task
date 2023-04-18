package org.example.behavioral_patterns.command;

public class Car {

    public void startEngine(){
        System.out.println("Завести двигатель");
    }

    public void stopEngine(){
        System.out.println("Заглушить двигатель");
    }

    public void checkEngine(){
        System.out.println("Проверить двигатель");
    }
}
