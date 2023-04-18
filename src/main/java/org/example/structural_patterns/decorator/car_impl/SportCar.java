package org.example.structural_patterns.decorator.car_impl;

import org.example.structural_patterns.decorator.Car;

public class SportCar implements Car {
    private Car car;

    public SportCar(Car car){
        this.car = car;
    }


    @Override
    public int getSpeed() {
        return this.car.getSpeed() + 100;
    }

    @Override
    public int getWeight() {
        return this.car.getWeight() - 200;
    }
}
