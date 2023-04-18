package org.example.behavioral_patterns.observer.observer_impl;

import org.example.behavioral_patterns.observer.Observer;

public class FinancialNewspaper implements Observer {
    @Override
    public void handleEvent(int index) {
        System.out.println("SnP500 обновил значение: " + index);
        if(index <= 250)
            System.out.println("газета пишет статью о неминуемом крахе финансовой системы");
        else if(index > 250 && index <= 500)
            System.out.println("газета пишет статью о застое рынка");
        else if(index > 500)
            System.out.println("газета пишет статью о сговоре с целью раздуть рынок");
    }
}
