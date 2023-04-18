package org.example.behavioral_patterns.observer.observed_impl;

import org.example.behavioral_patterns.observer.Observed;
import org.example.behavioral_patterns.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Observed {
    private int indexSnP500 = 400;
    private List<Observer> observers;

    public StockMarket(){
        observers = new ArrayList<>();
    }

    public void setIndexSnP500(int price){
        indexSnP500 = price;
        notifyObserver();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer o: observers){
            o.handleEvent(indexSnP500);
        }
    }
}
