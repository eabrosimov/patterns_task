package org.example.structural_patterns.facade;

public class Engine {
    private boolean engineStarting;

    public void getRotation(Starter starter){
        if(starter.isBoost()){
            engineStarting = true;
            starter.setBoost(false);
        }
    }

    public boolean isEngineStarting() {
        return engineStarting;
    }
}
