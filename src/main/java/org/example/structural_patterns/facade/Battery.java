package org.example.structural_patterns.facade;

import java.util.Random;

public class Battery {
    private int batteryCharge;
    private Random random = new Random();

    public Battery(){
        batteryCharge = random.nextInt(100);
    }

    public boolean isCharged(){
        if(batteryCharge > 20)
            return true;

        return false;
    }

    public int getBatteryCharge() {
        return batteryCharge;
    }

    public void setBatteryCharge(int batteryCharge) {
        this.batteryCharge = batteryCharge;
    }
}
