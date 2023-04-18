package org.example.behavioral_patterns.observer.observer_impl;

import org.example.behavioral_patterns.observer.Observer;

public class MarketAnalyst implements Observer {
    @Override
    public void handleEvent(int index) {
        System.out.println("SnP500 обновил значение: " + index);
        if(index <= 250)
            System.out.println("Аналитик делает пессимистичный прогноз");
        else if(index > 250 && index <= 500)
            System.out.println("Аналитик делает нейтральный прогноз");
        else if(index > 500)
            System.out.println("Аналилит делает оптимистичный прогноз");
    }
}
