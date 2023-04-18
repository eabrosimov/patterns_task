package org.example.behavioral_patterns.observer.observer_impl;

import org.example.behavioral_patterns.observer.Observer;

public class Investor implements Observer {
    @Override
    public void handleEvent(int index) {
        System.out.println("SnP500 обновил значение: " + index);
        if(index <= 250)
            System.out.println("Инвестор делает балансировку портфеля и закупается по дешевке");
        else if(index > 250 && index <= 500)
            System.out.println("Инвестор продолжает держать бумаги");
        else if(index > 500)
            System.out.println("Инвестор делает балансировку портфеля и скидывает перегретые бумаги");
    }
}
