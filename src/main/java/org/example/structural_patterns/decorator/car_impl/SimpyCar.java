package org.example.structural_patterns.decorator.car_impl;

import org.example.structural_patterns.decorator.Car;

public class SimpyCar implements Car {
    private int speed = 100;
    private int weight = 1500;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int getWeight() {
        return weight;
    }
}
