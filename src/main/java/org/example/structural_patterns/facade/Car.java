package org.example.structural_patterns.facade;

public class Car {
    private Battery battery;
    private Starter starter;
    private Engine engine;

    public Car(){
        battery = new Battery();
        starter = new Starter();
        engine = new Engine();
    }

    public void start(){
        starter.getBoost(battery);
        engine.getRotation(starter);

        if(engine.isEngineStarting()){
            System.out.println("Машина завелась, можно ехать");
        } else
            System.out.println("Машина не завелась, т.к. аккумулятор разряжен");
    }
}
