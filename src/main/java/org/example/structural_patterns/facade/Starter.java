package org.example.structural_patterns.facade;

public class Starter {
    private boolean boost;

    public void getBoost(Battery battery){
        if(battery.isCharged()) {
            int charge = battery.getBatteryCharge() - 10;
            battery.setBatteryCharge(charge);
            boost = true;
        }
    }

    public boolean isBoost() {
        return boost;
    }

    public void setBoost(boolean boost) {
        this.boost = boost;
    }
}
