package org.example.structural_patterns.decorator;

import org.example.structural_patterns.decorator.car_impl.SimpyCar;
import org.example.structural_patterns.decorator.car_impl.SportCar;

public class Main {
    public static void main(String[] args) {
        Car simpyCar = new SimpyCar();
        Car sportCar = new SportCar(simpyCar);

        System.out.println(simpyCar.getSpeed());
        System.out.println(sportCar.getSpeed());
    }
}
